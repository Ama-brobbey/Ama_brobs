package org.ama.area;

public class Arrays {
	public static void main(String args[]) {
		
		//creating array table
		System.out.println("Index\tValue");
		
		// initialising our array
		int arr [] = {32,12,36,9,56,45};
		//int arr [] = {};
		//creating the index of the array
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.println(i + "\t" + arr[i]);
		}
	}

}
