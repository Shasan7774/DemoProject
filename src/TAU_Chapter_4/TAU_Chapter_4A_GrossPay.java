package TAU_Chapter_4;

import java.util.Scanner;

public class TAU_Chapter_4A_GrossPay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int maxHours = 40;
		double payRate = 15;
		
		
		System.out.println("Enter Number Of Hours Worked");
		Scanner scr = new Scanner(System.in);
		double hoursWorked = scr.nextDouble();
		
		while(hoursWorked > maxHours || hoursWorked < 1 ){
		System.out.println("Wrong Input! Please Try again!!!");
		hoursWorked = scr.nextDouble();
		scr.close();
		
		}
		
		double grossPay=hoursWorked * payRate;
		System.out.println("Employees Wages:"+grossPay);
	}

}
