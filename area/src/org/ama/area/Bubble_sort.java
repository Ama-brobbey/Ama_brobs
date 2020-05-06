package org.ama.area;
import java.util.Scanner;
public class Bubble_sort {
public static void main (String args) {
	int count, temp;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of inputs");
	count = sc.nextInt();
	
	int num[] = new int[count];
	System.out.println("Enter array inputs");
	for(int i=0; i < count; i++) {
		num[i] = sc.nextInt();
	}
	sc.close();
	for(int i = 0; i < count; i++) {
		 for(int j = i+1;j<count;j++) {
			 if(num[i] > num[j]) {
				 temp = num[i];
				 num[i] = num[j];
				 num[j] = temp;
			 }
	}
	}
 System.out.println("Array input in ascending order");
for (int i = 0; i < count - 1 ; i++ ) {
	System.out.print(num[i] + " ,");
}
System.out.println(num[count - 1]);
}
}