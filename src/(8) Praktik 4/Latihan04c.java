//penghitung nilai kelulusan
import java.util.Scanner;

public class Latihan04c {
    public static void main(String[] args)
    {
        //deklarasi var
        String nama, n_huruf;
        int nilai;

        Scanner oscan01 = new Scanner(System.in);

        System.out.println("Data Test");
        System.out.println("=============================");
        System.out.print("Nama               : ");
        nama = oscan01.nextLine();
        System.out.print("Program Studi      : ");
        nama = oscan01.nextLine();
        System.out.print("Nilai              : ");
        nilai = oscan01.nextInt();

        //hitung nilai huruf
        if (nilai >= 85)
            n_huruf = "A";
        else if(nilai >= 70)
            n_huruf = "B";
        else if(nilai >= 60)
            n_huruf = "C";
        else if(nilai >= 50)
            n_huruf = "D";
        else 
            n_huruf = "E";

        System.out.println("Nilai Huruf        : " + n_huruf);
        System.out.println("=============================");
    }
}
