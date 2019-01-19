package com.skilldistillery.jets;

public class FighterJet extends Jet implements CombatReady {

	public FighterJet(String model, int speed, int range, long price) {
		super(model, speed, range, price);

	}

	@Override
	public void fight() {		
	}

}
