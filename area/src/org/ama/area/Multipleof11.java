package org.ama.area;
import java.util.Scanner;
public class Multipleof11 {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number:");
	int num = sc.nextInt();
	
	 specialEleven(num);
}
	 
	 public static boolean specialEleven(int num) {
		 boolean isSpecial = true;
		 
	 
	 if(num<11 ) {
		 isSpecial = false;
		 System.out.println("False");
		 
		 
	 }
	 else if ((num%11)==0 || (num%11)==1) {
		 isSpecial = true;
		 System.out.println("True");
	 }
	  
	   else {
		   isSpecial = false;
		 System.out.println("False");
	 
}
	 return isSpecial;
}
}

