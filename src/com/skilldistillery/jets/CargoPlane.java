package com.skilldistillery.jets;

public class CargoPlane extends Jet implements CargoCarrier{

	public CargoPlane(String model, int speed, int range, long price) {
		super(model, speed, range, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void loadCargo() {
		// TODO Auto-generated method stub
		System.out.println(this.getModel() + "Load" );
		
	}

}
