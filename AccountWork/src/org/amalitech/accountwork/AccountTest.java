package org.amalitech.accountwork;
import java.util.Scanner;
public class AccountTest {
	public class Accountwork extends AccountTest {

	}

	public static void main(String args[]) {
		
		AccountWork  account1 = new AccountWork ( 50.00 );
		AccountWork  account2 = new AccountWork ( -7.53 );
		
		System.out.printf( "account1 balance: $%.2f\n", account1.getBalance()) ;
		System.out.printf( "account2 balance:$%.2f\n\n", account2.getBalance());
	Scanner input = new Scanner(System.in);
	double depositAmount;
	System.out.println( "Enter deposit amount for account1:");
	depositAmount = input.nextDouble();
	System.out.printf( "\n adding %.2f to account1 balance\n\n",depositAmount ); 
	System.out.printf("account1 balance' $%.2f\n", account1.getBalance()); 
	System.out.printf("account2 balance' $%.2f\n", account2.getBalance()); 
	
	System.out.print(" Enter deposit amount for account2:");
	depositAmount = input.nextDouble();
	System.out.printf( "\n adding %.2f to account2 balance\n\n",depositAmount );
	account2.credit(depositAmount);
	
	System.out.printf("account1 balance' $%.2f\n",account1.getBalance());
			System.out.printf("account2 balance' $%.2f\n",account2.getBalance());
}

	//private Object getBalance() {
		// TODO Auto-generated method stub
	//	return null;
	}
	


