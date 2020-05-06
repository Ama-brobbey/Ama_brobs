package org.ama.area;
import java.util.Scanner;
public class Circle {
public static void main(Stringgsstr args []) {
	double r;
	Scanner sc = new Scanner(System.in);
	System.out.println(" Enter the value of r :");
	r = sc.nextInt();
	double area = Math.PI*Math.pow(r, 2);
	double perimeter = 2 * Math.PI * r;
	System.out.println("The area is :"+ area);
	System.out.println("the perimeter is :" +perimeter);

}
}
