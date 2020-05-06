package org.ama.area;
import java.util.Scanner;
public class Triangle {
	// finding the area of a circle
	int base;
	int height;
	double area;
	 
	public void circleParts() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of base:");
		base = sc.nextInt();
		System.out.println("Enter the value of the height:");
		height = sc.nextInt();
	}
	public void calculate() {
		area = 0.5*base*height;
		System.out.println("Area of the triangle is: " + area);
	}
	
	public static void main (String args[]) {
		Triangle inpt = new Triangle();
		inpt.circleParts();
		inpt.calculate();
	}
		 
 }
