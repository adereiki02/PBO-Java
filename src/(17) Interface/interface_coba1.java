//deklarasi interface bank
interface Bank {
	float rateOfInterest();
}

//deklarasi class BankBPD
class BankBPD implements Bank
{
	public float rateOfInterest()
	{
		return 9.7f;
	}
}

//main program
class interface_coba1 {
	public static void main(String[] args)
	{
		//object
		BankBPD b = new BankBPD();
		System.out.println("ROI: " + b.rateOfInterest());
	}
}