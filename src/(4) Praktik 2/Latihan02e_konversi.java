//versi konversi tipe data var luas menjadi int
public class Latihan02e_konversi {
    public static void main(String abcd[])
    {
        int a, t;
        double luas;
        
        a = 2;
        t = 7;


        luas = 0.5 * a * t;

        int luas2 = (int) luas; //konversi setelah mendapatkan hasil
        

        System.out.println("Luas Segitiga : " + luas);
        System.out.println("Luas Segitiga Konversi : " + luas2);
    }
}
