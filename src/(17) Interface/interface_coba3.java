interface Interface01 {
	public void myMethod(); //interface method
}

interface Interface02 {
	public void myOtherMethod(); //interface method
}

//mengisi isi fungsi interface
class DemoClass implements Interface01, Interface02 {
	public void myMethod() {
		System.out.println("Method Interface 01");
	}
	
	public void myOtherMethod() {
		System.out.println("Method Interface 02");
	}
}

//mencetak 2 sekaligus
class Main {
	public static void main(String[] args){
		DemoClass myObj = new DemoClass();
		myObj.myMethod();
		myObj.myOtherMethod();
	}
}