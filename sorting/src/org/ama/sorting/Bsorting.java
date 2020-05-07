package org.ama.sorting;
import java.util.Scanner;
public class Bsorting {
	public static void main (String args[]) {
		int count, temp;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of inputs");
		count = sc.nextInt();
		
		if(count<=0) {
			System.out.println("Enter a positive number");
			main(args);
			}
		int num[] = new int[count];
		System.out.println("Enter array inputs");
		for(int a=0; a < count; a++) {
			num[a] = sc.nextInt();
		}
		sc.close();
		for(int a = 0; a < count; a++) {
			 for(int b = a+1;b<count;b++) {
				 if(num[a] > num[b]) {
					 temp = num[a];
					 num[a] = num[b];
					 num[b] = temp;
				 }
		}
		}
	 System.out.println("Array input in ascending order");
	for (int a = 0; a < count - 1 ; a++ ) {
	
		System.out.print(num[a] + ",");
		  
	}
	System.out.println(num[count - 1]);
	}
	}

