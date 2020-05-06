package org.ama.area;
import java.util.Scanner;
public class Studentmarks {

//main method where all the codes will operate
	public static void main(String args[]) {

	display();
	}

	public static void display() {

	//Scanner declaration
	Scanner sc = new Scanner(System.in);

	//getting size of array
	System.out.println("How many  marks do you want to input?");
	int num = sc.nextInt();

	//variable declaration and Initialization
	int marks [] = new int[num];
	int temp = 0;
	double sum = 0;
	double average;

	//accepting marks into array
	System.out.println("Enter the marks");
	for(int i=0; i<num; i++) {
	marks [i] = sc.nextInt();
	}

	//sorting marks in ascending order
	for(int m=0; m<marks.length; m++) {
	for(int n=m+1; n<marks.length; n++) {
	if(marks[m] > marks[n]) {
	temp = marks[m];
	marks[m] = marks[n];
	marks[n] = temp;
	}
	}
	}

	//Getting the sum of  the marks
	for(int j=0; j<marks.length; j++) {
	sum = sum + marks[j];
	}

	//Getting the  average
	average = sum/num;

	//outputting maximum, minimum and average of marks
	System.out.print("The maximum mark " + marks[marks.length-1]
	+ "\nThe minimum mark " + marks[marks.length-num]
	+ "\nThe average mark " + average);
	System.out.println("\n");

	//getting the number times a score appears
	int scores [] = new int [6];

	for (int v=0;v<scores.length; v++) {
	if(marks[v]<=20) {
	scores[0]++;
	}
	if(marks[v]>20 && marks[v]<=40) {
	scores[1]++;
	}
	if(marks[v]>40 && marks[v]<=60) {
	scores[2]++;
	}
	if(marks[v]>60 && marks[v]<=80) {
	scores[3]++;
	}
	if(marks[v]>80 && marks[v]<=100) {
	scores[4]++;
	}
	}

	int len = scores.length;
	int max = 0;

	for (int i = 0; i < len; i++) // finding the max of array
	{
	if (scores[i] > max) {
	max = scores[i];
	}
	}

	int max_num = max;
	int scnum = max;

	//plotting of graph
	for (int i = 0; i < max_num; i++) {
	System.out.print(scnum + "  >");
	if (i < (max_num - scores[0])) {
	System.out.print("        ");
	} else {
	for (int j = 0; j < 1; j++) {
	System.out.print(" #######");
	}
	}
	if (i < (max_num - scores[1])) {
	System.out.print("        ");
	} else {
	for (int j = 0; j < 1; j++) {
	System.out.print(" #######");
	}
	}
	if (i < (max_num - scores[2])) {
	System.out.print("        ");
	} else {
	for (int j = 0; j < 1; j++) {
	System.out.print(" #######");
	}
	}
	if (i < (max_num - scores[3])) {
	System.out.print("        ");
	} else {
	for (int j = 0; j < 1; j++) {
	System.out.print(" #######");
	}
	}
	if (i < (max_num - scores[4])) {
	System.out.print("        ");
	} else {
	for (int j = 0; j < 1; j++) {
	System.out.print(" #######");
	}
	}

	System.out.println();
	scnum--;
	}

	System.out.print("    ");
	for (int i = 0; i < 5; i++) {
	System.out.print("+-------");
	}
	System.out.print("+");

	System.out.print("\n   " + 0 + "       " + 21 + "      " + 41 + "      " + 61 + "      " + 81 + "      " + 100);

	sc.close();
	}

	}


