package com.skilldistillery.jets;

import java.util.Scanner;

public class JetsApplication {
	public static void main(String[] args) {
		displayUserMenu();

	}

	public static void displayUserMenu() {
		Scanner sc = new Scanner(System.in);
		int choice;
		AirField air = new AirField();
		do {
			System.out.println("What would you like to do?");
			System.out.println(
					"1. List fleet\n" + "2. Fly all jets\n" + "3. View fastest jet\n" + "4. View jet with longest range\n"
							+ "5. Load all Cargo Jets\n" + "6. Dogfight!\n" + "7. Add a jet to Fleet\n" + "8. Quit");

			choice = sc.nextInt();
			
		switch (choice) {
		case 1:
			air.listFleet();
			break;
		case 2:
			air.flyAllJets();
			break;
		case 3:
			air.viewFastestJet();
			break;
		case 4:
			air.viewJetWithLongestRange();
			break;
		case 5:
			air.loadAllCargo();
			break;
		case 6:
			System.out.println();
			break;
		case 7:
			air.addJet();
			break;
		case 8:
			System.out.println();
			break;
		default:
			System.out.println();
		}}while(choice !=8);
		sc.close();
	}

}
