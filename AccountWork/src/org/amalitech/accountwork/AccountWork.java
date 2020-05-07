package org.amalitech.accountwork;

public class AccountWork {
	
private double balance;

public AccountWork (double initialBalance) {
	if ( initialBalance >  0.0) 
		balance = initialBalance;
	
}
	public void credit ( double amount ) {
		balance = balance + amount;
	}
	
	public double getBalance() {
		return balance;
	}
	}
	

