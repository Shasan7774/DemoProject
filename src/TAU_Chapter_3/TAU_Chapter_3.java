package TAU_Chapter_3;

import java.util.Scanner;

public class TAU_Chapter_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int salary = 1000;
		int bonus = 250;
		int limit = 10;
		
		System.out.println("Enter the sales limit of the employee");
		Scanner scr = new Scanner (System.in);
		int sales = scr.nextInt();
		scr.close();
		
		if (sales>=limit) {
			salary = salary + bonus;
		}
		System.out.println("Gross salary of the employee is:" + salary);
	}

}
