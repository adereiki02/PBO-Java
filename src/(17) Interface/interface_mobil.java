interface Mobil {
	//information
	String Model();
    int Speed();
    int FuelTank();
    int MAX_GEAR = 6;
    
    //action
    void Pedal();
    void BrakePedal();
    void ClutchPedal();
    void GearUp();
    void GearDown();
    
}

class MobilLamborghini implements Mobil {
	private int GEAR = 0;
	
	//information
	public String Model()
	{
		System.out.println("Lamborghini Aventador");
	}
	
	public int Speed()
	{
		return 350;
	}
	
	public int FuelTank(){
		return 90;
	}
	
	//action
	@Override
	public void Pedal(){
		System.out.println("Aksi : Maju");
	}
	
	@Override
	public void BrakePedal(){
		System.out.println("Aksi : Berhenti");
	}
	
	@Override
	public void ClutchPedal(){
		System.out.println("Aksi : Ganti Kopling");
	}
	
	@Override
	public void GearUp(){
		GEAR +=1;
		System.out.println("Posisi Gear : " + this.getGear());
	}
	
	@Override
	public void GearDown(){
		if (this.GEAR == 0){
			GEAR = this.GEAR + 5;
		} 
		
		else
		{
			GEAR -= 1;
		}
		
		System.out.println("Posisi Gear : " + this.getGear());
	}
	
	public int getGear() {
		return this.GEAR;
	}
}