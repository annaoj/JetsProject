package com.skilldistillery.jets;

import java.util.Scanner;

public class JetsApplication {
	public static void main(String[] args) {
		displayUserMenu();

	}

	public static void displayUserMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("What would you like to do?");
		System.out.println(
				"1. List fleet\n" + "2. Fly all jets\n" + "3. View fastest jet\n" + "4. View jet with longest range\n"
						+ "5. Load all Cargo Jets\n" + "6. Dogfight!\n" + "7. Add a jet to Fleet\n" + "8. Quit");

		int choice = sc.nextInt();
		
		AirField air = new AirField();
		switch (choice) {
		case 1:
			air.listAllFleet();
			break;
		case 2:
			air.flyAllJets();
			break;
		case 3:
			System.out.println();
			break;
		case 4:
			System.out.println();
			break;
		case 5:
			air.loadAllCargo();
			break;
		case 6:
			System.out.println();
			break;
		case 7:
			System.out.println();
			break;
		case 8:
			System.out.println();
			break;
		default:
			System.out.println();
		}
		sc.close();
	}

}
