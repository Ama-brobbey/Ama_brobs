package org.ama.area;

public class MainClass {
	public static void main (Stringgsstr args[]) {
		ChurchPledge cp = new ChurchPledge();
		//cp.setmemberName("Ewurama");
		System.out.println("Members name is "+ cp.getmemberName());
		
		cp.sethouseholdNumber( 49);
		System.out.println("House hold number is "+ cp.gethouseholdNumber());
		
		cp.setamount(2300);
		System.out.println("Amount pledge is "+ cp.getAmount());
		
	
	}
        
}
