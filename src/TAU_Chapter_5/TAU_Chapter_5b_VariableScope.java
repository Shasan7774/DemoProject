package TAU_Chapter_5;

import java.util.Scanner;

public class TAU_Chapter_5b_VariableScope {
	static int requiredSalary = 25000;
	static int requiredCredit = 700;
	
	
	
	static Scanner scr = new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//initialize what we know

		double sal = getSalary();
		int credit = getCredit();
		scr.close();
		boolean qualified = isUserQualified(credit,sal);
		notifyUser(qualified);
		
		// notify the user
		
	}
	
	//get what we don't know
	public static double getSalary() {
		System.out.println("Enter your salary");
		double salary = scr.nextDouble();
		return salary;
		
	}
	
	public static int getCredit() {
		System.out.println("Enter your credit");
		int creditScore = scr.nextInt();
		return creditScore;
	}
	
	//check if the user is qualified
	public static boolean isUserQualified(int creditScore, double salary) {
		if (creditScore >= requiredCredit && salary >=requiredSalary ) {
			return true;
			
		}
		else {
			return false;
		}
	}
	public static void notifyUser(boolean isQualified) {
		if (isQualified) {
			System.out.println("Hi! Congratulations You have been approved!!!");
		}
		else {
			System.out.println("Sorry! Try Again!!!");
		}
		
	}
	
	
	

}
