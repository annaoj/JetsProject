package com.skilldistillery.jets;

public abstract class Jet {
	private String model;
	private int speed;
	private int range;
	private long price;
	
	public Jet(String model, int speed, int range, long price) {
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}
	
	public void fly(){
		System.out.println(this.model + "   flyiingggg!!!!!!   ");
	}
	
	public void listInfoJet(){
		System.out.println("Model is " + this.model + ", speed is " +this.speed + ", range is " +this.range + ", price is " + this.price);
	}
	
//	public Jet addJet(String model, int speed, int range, long price) {
//		JetImpl newJet = new JetImpl();
//		return newJet;
//	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}
	
	
	
	
	
	

}
