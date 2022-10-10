public class Latihan03a
{
    public static void main(String[] args)
    {
        int x = 5;

        //increment dan decrement ini sifatnya pre , akan mengeksekusi sekaligus menampilkan
        System.out.println("x      = " + x); //5
        System.out.println("x += 1 = " + (x += 1));//6
        System.out.println("x -= 2 = " + (x -= 2));//4
        System.out.println("x *= 3 = " + (x *= 3));//12
        System.out.println("x /= 4 = " + (x /= 4));//3
        System.out.println("x %= 5 = " + (x %= 5));//3

        System.out.println("\n==============================");
        System.out.println("Program : Latihan03a");
        System.out.println("NIM     : A12.2020.06455");
        System.out.println("Nama    : Ade Reiki Karuna");
    }
}