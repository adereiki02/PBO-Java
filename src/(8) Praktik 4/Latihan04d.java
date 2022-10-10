//penghitung biaya pemakaian air
import java.util.Scanner;

public class Latihan04d {
    public static void main(String[] args)
    {
        //deklarasi var
        String nama; 
        int water_usage_input, water_usage1, water_usage2, water_usage3, payment;

        Scanner oscan01 = new Scanner(System.in);

        System.out.println("Perhitungan Biaya Pemakaian Air");
        System.out.println("=============================");
        System.out.print("Nama               : ");
        nama = oscan01.nextLine();
        System.out.print("No. Pelanggan      : ");
        nama = oscan01.nextLine();
        System.out.print("Pemakaian Air      : ");
        water_usage_input = oscan01.nextInt();

        //hitung biaya pemakaian air
        // 10 m3 pertama = 1000
        // 10 m3 kedua   = 2000
        // selebihnya    = 5000


        if (water_usage_input <= 10)
        {
            payment = water_usage_input * 1000;
        }
        else if(water_usage_input <= 20)
        {
            water_usage1 = 10 * 1000;
            water_usage2 = (water_usage_input - 10) * 2000;

            payment = water_usage1 + water_usage2;
        }
        else
        {
            water_usage1 = 10 * 1000; //10.000
            water_usage2 = 10 * 2000; //20.000
            water_usage3 = (water_usage_input - 20) * 5000; //25.000

            payment = water_usage1 + water_usage2 + water_usage3;
        }

        System.out.println("Biaya Pemakaian    : " + payment);
        System.out.println("=============================");
    }
}
