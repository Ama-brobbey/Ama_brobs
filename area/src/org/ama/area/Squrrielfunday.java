package org.ama.area;
import java.util.Scanner;
public class Squrrielfunday {
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.println("Enter number of cigars");
int cigarNum = sc.nextInt();
     System.out.println("Is it weekday? Enter true or false");
		boolean bol = sc.nextBoolean();
	
		
		partySuccess(cigarNum,bol);

		}

		public static boolean partySuccess(int cigarNum, boolean isWeekDay) {

		boolean isSuccessful = true;

		if(isWeekDay) {

		if(cigarNum>=30 && cigarNum<=70) {

		System.out.println(isSuccessful);
		}
		else {

		System.out.println(!isSuccessful);

		}
		}
		else if(!isWeekDay){

		if(cigarNum>=30) {

		System.out.println(isSuccessful);
		}
		else {

		System.out.println(!isSuccessful);
		}

		}
		return isSuccessful;
		}


		
}
