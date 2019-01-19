package com.skilldistillery.jets;

public class FighterJet extends Jet implements CombatReady {

	public FighterJet(String model, int speed, int range, long price) {
		super(model, speed, range, price);

	}

	@Override
	public void fight() {

		System.out.println("                          /\\                                                   \n" + 
				"                         /--\\                                                  \n" + 
				"                        /    \\                                                 \n" + 
				"                      //      \\                                               \n" + 
				"                ____/ /   /\\   \\ \\____                                         \n" + 
				"               /  /  /___----___\\  \\  \\                                        \n" + 
				"             /____----          ----____\\                                      \n" + 
				"       ___----            |||  "+ this.getModel()+"----___                                \n" + 
				"___----                   ||/                  ----___                         \n" + 
				"\\____________----H|--_____||_____--|H----____________/ -PT                     \n" + 
				"                 O+       ||       +O                                          \n" + 
				"                          ()        \n\n\n");
	}

}
