package org.ama.area;
import java.util.Scanner;

public class Area {
	public static void main (Stringgsstr args []) {
	Scanner inpt = new Scanner(System.in);
	System.out.println("Enter length:");
	int length = inpt.nextInt();
	System.out.println("Enter width:");
	int width = inpt.nextInt();
	 int area = length * width;
 System.out.println("The area of the  rectangle is " + area);
}
}