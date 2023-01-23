package TAU_Chapter_2;

import java.util.Scanner;

public class TAU_Chapter_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Number of Hours Worked
		System.out.println("Enter the number of hours employe worked");
		System.out.println("Enter the number of hours employe worked");
		System.out.println("Enter the number of hours employe worked");
		System.out.println("Enter the number of hours employe worked");
		Scanner scr = new Scanner (System.in);
		int hours = scr.nextInt();
		
		// Hourly pay rate
		System.out.println("Enter the payrate of the employee worked");
		double payRate = scr.nextDouble();
		scr.close();
		
		
		
		// Multiply Hours & Pay rate
		double totalPay = hours * payRate;
		// Display Rate
		
		System.out.println("Total Salary of the Employee is:"+totalPay);

	}

}

