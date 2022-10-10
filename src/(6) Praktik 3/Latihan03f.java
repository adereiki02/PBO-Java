public class Latihan03f
{
	public static void main(String abcd[])
	{
		int a = 8;
		int b = 10;
		
		//pre increment dan post increment
		System.out.println("Nilai a     	 : " + ( a ) ); //8
		System.out.println("Nilai b          : " + ( b ) ); //10
		System.out.println("Nilai a++        : " + ( a++ ) ); //8 (9)
		System.out.println("Nilai ++b        : " + ( ++b ) ); //11
		System.out.println("Nilai a++ + ++a  : " + ( a++ + ++a ) ); // 9 + 11 = 20
		System.out.println("Nilai b++ + ++b  : " + ( b++ + ++b ) ); // 11 + 13 = 24
		
		System.out.println("\n==========================");
		System.out.println("Program : Latihan03f");
		System.out.println("NIM     : A12.2020.06455");
		System.out.println("Nama    : Ade Reiki Karuna");
	}
}