package org.ama.area;
import java.util.Scanner;
public class Sleepers {
	

	
		static boolean isMorning;
		static boolean isMom; 
		static boolean isAsleep;

		public static void main(String[] args) {
			
			System.out.println("***JAVA IF-ELSE ASSIGNMENT***");
			System.out.println("___________________________________________________________________________");
			System.out.println("Program returns true if a cell phone should be answered and false otherwise.");
			System.out.println();
			
			//This section calls answerCell method using test cases as parameters  
			System.out.println("Outputs for sample test cases: ");
			answerCell(false,false,false);
			answerCell(false,false,true);
			answerCell(true,false,false);
			
			//acceptInput method is called to allow user input their own parameters
			acceptInput();
			//answerCell method is called again with user inputs as parameters
			answerCell(isMorning,isMom,isAsleep);
			
		}
		//Method accepts three boolean parameters and returns shouldAnswer based on conditions
		public static boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
			boolean shouldAnswer;
			//First check if it is morning
			if(isMorning) {
				//If true, check if person is asleep
				if(isAsleep) {
					shouldAnswer = false;		//if asleep, shouldAnswer is false
					System.out.println(shouldAnswer);
				}
				//If person is not asleep,
				else {
					//then check if it is mom calling
					if(isMom) {
						shouldAnswer = true;		//if it is mom, shouldAnswer is true 
						System.out.println(shouldAnswer);
					}
					//If it is not mom calling,
					else {
						shouldAnswer = false;		//then should answer is false
						System.out.println(shouldAnswer);
					}
				}
			}
			//If it is not morning,
			else {
				//check if person is not asleep
				if(!isAsleep) {
					shouldAnswer = true;		//if person is not asleep, shouldAnswer is true
					System.out.println(shouldAnswer);
					
				}
				//Else if person is asleep,
				else {
					shouldAnswer = false;		//then shouldAnswer is false
					System.out.println(shouldAnswer);
				}
			}
				
			return shouldAnswer;
		}
		
		//Method to accept input from user 
		public static void acceptInput() {
			
			System.out.println();
			System.out.println("Test with your own inputs\n");
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Is it morning? Enter \"true\" if yes and \"false\" if no: ");
			isMorning = sc.nextBoolean();
			
			System.out.println("Is it Mom's call? Enter \"true\" if yes and \"false\" if no: ");
			isMom = sc.nextBoolean();
			
			System.out.println("Asleep? Enter \"true\" if yes and \"false\" if no: ");
			isAsleep = sc.nextBoolean();
			
			sc.close();
		}
		
	}

