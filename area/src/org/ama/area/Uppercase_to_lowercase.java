package org.ama.area;
import java.util.Scanner;
public class Uppercase_to_lowercase {
public static void main (String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter  string :");
	String str = sc.nextLine();
	str = str.toLowerCase();
	System.out.println("The lower case is : " + str);
	
}
}
