package com.skilldistillery.jets;

public class AirField {
	Jet[] myJetList = new Jet[10];
	
	public AirField() {
		myJetList[0] = new CargoPlane("C-130",368,2361,30_000_000);
		myJetList[1] = new FighterJet("T-38",858,2300,6_173_000);
		
	};
	
	public void flyAllJets() {
		for (Jet jet : myJetList) {
			if(jet != null) {
				jet.fly();
				
			}
		}
	};
	
	public void loadAllCargo() {
		for (Jet jet : myJetList) {
			if(jet != null && jet instanceof CargoPlane) {
				CargoPlane temp = (CargoPlane) jet;
				temp.loadCargo();			
				
			}
		}
	}
	
	public void listAllFleet() {

		int count = 0;
		for (Jet jet : myJetList) {
			if(jet != null) {

				jet.listFleet();		
				count = count+1;
			}
		}
		System.out.println("There are " + count + " planes");
	}

	
	
	

}
