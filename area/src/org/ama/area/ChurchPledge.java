package org.ama.area;

public class ChurchPledge {
	private  Stringgsstr  memberName;
	private int householdNumber;
	private int Amount;
	private Stringgsstr emailAddress;
	
	public void setmemberName(Stringgsstr newmemberName) {
		this.memberName = newmemberName;
		
	}
	public Stringgsstr getmemberName() {
		return memberName;
		
	}

	public void sethouseholdNumber(int newhouseholdNumber) {
		this.householdNumber = newhouseholdNumber;
	}
	
	public int gethouseholdNumber() {
		return householdNumber;
	}
	 
	
	public void setamount(int newamount) {
		this.Amount = newamount;
		
	}
	 public int getAmount() {
		 return Amount;
		 
	 }
	 public void setemailAddress(Stringgsstr emailAdress) {
		 
	 }
	 public Stringgsstr getemailAddress() {
		 return emailAddress;
	 }
	 
}
