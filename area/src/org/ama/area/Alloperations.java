package org.ama.area;
import java.util.Scanner;
public class Alloperations {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		int num1 = sc.nextInt();
		System.out.println("Enter second number;");
		int num2 = sc.nextInt();
		int total1 = num1 * num2;
		System.out.println("the product the two numbers are: "+total1);
		int total2 = num1+num2;
		System.out.println("The sum of the two numbers are: "+total2);
		int total3 = num1 -num2;
		System.out.println("The subtraction of the two numbers are: "+ total3);
		int total4 = num1%num2;
		System.out.println(" the modulus of the two numbers are: "+total4);
	}

}
