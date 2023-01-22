package TAU_Chapter_3;

import java.util.Scanner;

public class TAU_Chapter_3F_Relational_Logical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		// to qualify salary must be 30000
		// job at least 2 years
		
		int requiredSalary = 30000;
		int requiredYears = 2;
		
		System.out.println("Enter Your Salary");
		Scanner scr = new Scanner(System.in);
		
		int exactSalary = scr.nextInt();
		
		System.out.println("Enter Your Job Experience");
		int exactYears = scr.nextInt();
		scr.close();
		
		if(exactSalary >= requiredSalary || exactYears >= requiredYears) {
			
				System.out.println("Congrats! You are eligible to take loan.");
		
		}
	
			
		else {
			System.out.println("Sorry!Your are not eligible");
		}
			

	}

}
