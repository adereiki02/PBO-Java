public class Latihan01c {
    public static void main(String[] args)
    {
        System.out.println("Hasil 1 : " + 1 + 1); //tidak terbaca operasi penambahan karena terdapat string
        System.out.println("Hasil 1 : " + (1+1)); //terbaca operasi penambahan karena string diluar kurung
        System.out.println(1 + 1); 
        System.out.println("1" + 1);
        System.out.println(1 + "1");
        System.out.println("1 + 1");
    }
}
