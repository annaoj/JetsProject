package com.skilldistillery.jets;

import java.util.Scanner;

public class AirField {
	Jet[] myJetList = new Jet[10];

	public AirField() {
		myJetList[0] = new CargoPlane("C-130", 368, 2361, 30_000_000);
		myJetList[1] = new FighterJet("T-38", 858, 2300, 6_173_000);
		myJetList[2] = new CargoPlane("KC-135", 580, 1500, 39_600_000);
		myJetList[3] = new FighterJet("F-22 Raptor", 858, 2300, 6_173_000);
		myJetList[4] = new FighterJet("F-16", 1500, 2622, 18_800_000);

	};

	public void flyAllJets() {
		for (Jet jet : myJetList) {
			if (jet != null) {
				jet.fly();

			}
		}
	};

	public void loadAllCargo() {
		for (Jet jet : myJetList) {
			if (jet != null && jet instanceof CargoPlane) {
				CargoPlane temp = (CargoPlane) jet;
				temp.loadCargo();

			}
		}
	}

	public void listFleet() {
		int count = 0;
		for (Jet jet : myJetList) {
			if (jet != null) {

				jet.listInfoJet();
				count = count + 1;
			}
		}
		System.out.println("There are " + count + " planes");
	}

	public void viewFastestJet() {
		Jet tempFast = myJetList[0];
		for (Jet jet : myJetList) {
			if (jet != null && (tempFast.getSpeed() < jet.getSpeed())) {
				tempFast = jet;
			}
		}
		System.out.println("The fastest jet is " + tempFast.getModel() + "\nFull Information: ");
		tempFast.listInfoJet();
	}

	public void viewJetWithLongestRange() {
		Jet tempLong = myJetList[0];
		for (Jet jet : myJetList) {
			if (jet != null && (tempLong.getRange() < jet.getRange())) {
				tempLong = jet;
			}
		}
		System.out.println(tempLong.getModel() + " has the longest range " + "\nFull Information: ");
		tempLong.listInfoJet();
	}

	public void addJet() {
		String model;
		int speed;
		int range;
		long price;
		int type;

		Scanner sc = new Scanner(System.in);
		System.out.println("Is it Fighter Jet (1) or Cargo plane (2) :");
		type = sc.nextInt();
		System.out.println("What is the model of your plane? : ");
		model = sc.next();

		System.out.println("What is the speed of your plane? : ");
		speed = sc.nextInt();

		System.out.println("What is the range of your plane? : ");
		range = sc.nextInt();

		System.out.println("What is the price of your plane? : ");
		price = sc.nextLong();
		Jet newCustomJet = null;
		if (type == 1) {
			newCustomJet = new FighterJet(model, speed, range, price);

		} else if (type == 2) {
			newCustomJet = new CargoPlane(model, speed, range, price);

		} else {
			System.out.println("Wrong input");
		}
		
		for (int i = 0; i < myJetList.length; i++) {
			if (myJetList[i] == null) {
				myJetList[i] = newCustomJet;
				break;
			}
		}

	}

	public void makeJetsFight() {
		for (Jet jet : myJetList) {
			if (jet != null && jet instanceof FighterJet) {
				FighterJet temp = (FighterJet) jet;
				temp.fight();
			}
		}
	}
}
