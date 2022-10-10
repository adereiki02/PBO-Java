public class Latihan03b {
    public static void main(String abcd[])
    {
        int a, hasil;
        a = 14;
        hasil = (a++ > 14) ? 10: 20;
        System.out.println( "Output Satu : " + hasil); //20

        hasil = (a <= 14) ? 30: 40;
        System.out.println( "Output Dua : " + hasil); //40

        hasil = (a>14 && a<45) ? 50: 60;
        System.out.println( "Output Tiga : " + hasil); //50

        hasil = (a<14 || a<45) ? 70: 80;
        System.out.println( "Output Empat : " + hasil); //70

        System.out.println("\n==============================");
        System.out.println("Program : Latihan03b");
        System.out.println("NIM     : A12.2020.06455");
        System.out.println("Nama    : Ade Reiki Karuna");
    }
}
