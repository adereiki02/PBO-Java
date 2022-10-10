//method hitung
//note penamaan class bukan merupakan public class
//note penamaan public class harus sesuai dengan nama file
class Hitung {
    void methodTambah(int a, int b)
    {
        System.out.println(a + " + " + b + " = " + (a + b));
    }

    void methodKurang(int a, int b)
    {
        System.out.println(a + " - " + b + " = " + (a - b));
    }

    void methodKali(int a, int b)
    {
        System.out.println(a + " * " + b + " = " + (a*b));
    }

    void methodBagi(int a, int b)
    {
        System.out.println(a + " / " + b + " = " + (a/b));
    }
}

public class Latihan05c {
    public static void main(String args[])
    {
        Hitung objHitung = new Hitung();

        objHitung.methodTambah(10, 50); // 60
        objHitung.methodKurang(10, 50); // -40
        objHitung.methodKali(50, 10); // 500
        objHitung.methodBagi(50, 10); // 5

    }
}
