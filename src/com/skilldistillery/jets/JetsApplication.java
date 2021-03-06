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
							+ "5. Load all Cargo Jets\n" + "6. Dogfight!\n" + "7. Add a jet to Fleet\n" + "8. Fly individual jet\n" +"9. Quit\n ");

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
			air.makeJetsFight();
			break;
		case 7:
			air.addJet();
			break;
		case 8:
			air.flyIndividualJet();
			break;
		case 9:
			System.out.println("Good Bye!!!");
			break;
		default:
			System.out.println("Wrong Choice!!");
		}}while(choice !=8);
		sc.close();
	}

}
