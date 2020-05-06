package org.ama.area;
 //Checking for prime numbers from 1 to 100;
import java.util.Scanner;

public class PrimeNumbers {
	public static void main (Stringgsstr args []) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first number:");
		int start = s.nextInt();
		System.out.println("Enter second number :");
		int end = s.nextInt();
		System.out.println("set of prime numbers from " + start + " to " + end );
		
		 for (int i = 1; i<= end ; i++) {
			 if (isPrime (i)) {
				 System.out.print(i + ",");
			 }
			
		 }
	}
		 public static boolean isPrime(int n) {
			 if (n <= 1) {
				 return false;
			 }
		 
    for (int i =2 ; i<= Math.sqrt(n) ; i++) {
    	if (n % i == 0) {
    		return false;
}
    }
    	return true;
    }	
    }
	
	

	