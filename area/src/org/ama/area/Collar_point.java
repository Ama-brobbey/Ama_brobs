package org.ama.area;

public class Collar_point {
	public static void main(String args []) {
		 
System.out.println("Array for the collar point is:");
	int num [][] = {{04,25,01,36,45},{12,22,80,15,10},{13,20,3,19,15},{25,58,26,06,48}};
	
	
	display(num);
	collar_point(num);
	
	}
	public static void display(int n [][]) {
		
		for(int i = 0 ;  i < n.length; i++) {
			for (int j = 0 ; j < n[i].length;j++){
				System.out.print(n[i][j]+"\t");
				}
			n[3][2] = 20;
			System.out.println(n[3][2] = 20);
			
			
		System.out.println();
		}
	}
	//Creating a new method for the collar point.
		static void collar_point(int num[][]) {
			for(int i = 0; i < num.length; i++) {
				int row_max = num[i][0];
				 int columnIndex = 0;
				 int rowIndex = 0;
				  boolean collpo_bool = true;
				  
				  //getting the largest value in a row
				  for(int j = 1; j < num.length;j++) {
					  if (num[j][columnIndex] < row_max) {
						row_max = num[i][j];
						columnIndex = j;
						rowIndex = i;
					  }
				  }	
				  //finding out if largest value in row is the  smallest in its column
				  for(int j = 0 ;j< num.length;j++) {
					  if(num[j][columnIndex]<row_max) {
						  
						  collpo_bool = false;
						  break;  
					  }
				  }
				//outputting collar point
					if(collpo_bool) {
			
					System.out.println("list of collar points in Arrar A: A["+( + rowIndex + 1) + ","+(columnIndex +1)+"] = "+row_max);

		} 
		
      }
			}
}
