package org.ama.area;
import java.util.Scanner;
public class Fibonacci {
	public static void main(Stringgsstr ars []) {
		Scanner s = new Scanner(System.in) ;
		int number, t1 = 0,t2 = 1;
		System.out.println("Enter the number of terms :");
		Scanner sc = new Scanner(System.in);
		number  = sc.nextInt();
		System.out.println("The fibonacci series of " + number + " number are :");
		for (int i = 1; i <= number ; i++) {
			System.out.print(t1 + ",");
			int sum = t1 + t2;
			t1 = t2;
			t2 = sum;
			
		}
			
		}
	}


