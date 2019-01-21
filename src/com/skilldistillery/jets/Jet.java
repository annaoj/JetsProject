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
		System.out.print( "\t" +this.model );
		System.out.println(" is Ready to take off  ");
		System.out.println("__|__\n" + 
				"\\___/\n" + 
				" | |\n" + 
				" | |\n" + 
				"_|_|______________\n" + 
				"        /|\\ \n" + 
				"      */ | \\*\n" + 
				"      / -+- \\\n" + 
				"  ---o--(_)--o---\n" + 
				"    /  0 \" 0  \\\n" + 
				"  */     |     \\*\n" + 
				"  /      |      \\\n" + 
				"*/       |       \\*");
		System.out.println("\n\n\n");
		System.out.println(".......And Flyyyyiingggg");
		System.out.println("          _  _\n" + 
				"         ( `   )_\n" + 
				"        (    )    `)\n" + 
				"      (_   (_ .  _) _)\n" + 
                "                    __|__ \n" + 
                "		\"*---o0o---*"+
				"                                     _\n" + 
				"                                    (  )\n" + 
				"     _ .                         ( `  ) . )\n" + 
				"   (  _ )_                      (_, _(  ,_)_)\n" + 
				" (_  _(_ ,)");

	System.out.println("");
	}
	
	public void listInfoJet(){
		if(this.price >=1000000.0) {
			System.out.println("Model is " + this.model + ",speed is " +this.speed + " mph " + ",range is " +this.range + " mi " +",price is " + String.format("%.2fM", this.price/ 1000000.0));

		}else {
			System.out.println("Model is " + this.model + ",speed is " +this.speed + " mph " + ",range is " +this.range + " mi " +",price is " +  String.format("%,d",this.price));
		}
	}

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
