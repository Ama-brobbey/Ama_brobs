package org.ama.area;
import java.util.Scanner;
public class Stringgsstr {
	public static void main(String args []) {
		 Scanner sc = new Scanner (System.in);
		 
		System.out.println("Enter the first string:");
		String str = sc.nextLine();
		
		System.out.println("Enter the second string: ");
		String strr = sc.nextLine();
		String space=" ";
		
		 String totalstr = str.substring(1)+space +strr.substring(1);
		
		 System.out.println(totalstr );
		 }
		 
	}


