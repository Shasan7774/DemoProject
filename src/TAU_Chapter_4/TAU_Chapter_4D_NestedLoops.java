package TAU_Chapter_4;

import java.util.Scanner;

public class TAU_Chapter_4D_NestedLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalStudents = 24;
		int totalTests = 4;
		
		
		Scanner scr = new Scanner (System.in);
		
		for(int i=0; i<totalStudents; i++) {
			
			double total = 0;
			for(int j=0; j<totalTests;j++) {
				System.out.println("Enter Marks in Test # " +(j+1));
				double score = scr.nextDouble();
				total= total + score;
				
				
			}
			
			double testsAverage = total / totalTests;
			System.out.println("Average of tests for student # "+ (i+1)+ " is " +testsAverage);
		}
		
		
		scr.close();
		
		
		
		

	}

}
