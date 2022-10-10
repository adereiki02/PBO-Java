	class persegipanjang{
		//atribut 
		int panjang = 4;
		int lebar = 3;
		
		
		//method
		public void luas()
		{
			int xluas = panjang * lebar;
			System.out.println(xluas);	
		}
	}
	
	class kubus extends persegipanjang {
		//atribut kubus
		int tinggi = 2;
		
		//method
		public void volume(){
			int xvolume = panjang * lebar * tinggi;
			System.out.println(xvolume);
		}
	}

public class inheritance_uts_teori {
	public static void main(String[] args)
	{
		persegipanjang x = new persegipanjang();
		System.out.print("Luas Persegi Panjang : " );
		x.luas();
		
		kubus v = new kubus();
		System.out.print("Volume Kubus         : " );
		v.volume();

	}
}