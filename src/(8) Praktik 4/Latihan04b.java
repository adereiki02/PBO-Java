import java.util.Scanner;

public class Latihan04b {
    public static void main(String[] args)
    {
        //deklarasi var
        String nama;
        int a=1, gaji, penjualan;
        double bonus, total=0, terima;

        Scanner oscan01 = new Scanner(System.in);

        System.out.println("Hitung Total Penjualan");
        System.out.println("=============================");
        System.out.print("Nama               : ");
        nama = oscan01.nextLine();
        System.out.print("Bulan              : ");
        nama = oscan01.nextLine();
        System.out.println("\nTotal Penjualan");

        //looping
        while (a<5)
        {
            System.out.print("Minggu ke- " + a + " : ");
            penjualan = oscan01.nextInt();
            total += penjualan;
            a++;
        }

        //hitung bonus
        if (total > 5000000)
            bonus = 0.1 * total;
        else  
            bonus = 0.5 * total;

        terima = total + bonus;

        System.out.println("====================");
        System.out.println("Total       : " + (int)total); //agar tidak desimal
        System.out.println("Bonus       : " + (int)bonus);
        System.out.println("Terima      : " + (int)terima);
    }
}
