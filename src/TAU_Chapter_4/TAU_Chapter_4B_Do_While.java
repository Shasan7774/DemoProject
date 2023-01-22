package TAU_Chapter_4;

import java.util.Scanner;

public class TAU_Chapter_4B_Do_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner(System.in);
		boolean again;// = false;
		do {
			System.out.println("Enter First Number");
			
			double firstNumber = scr.nextDouble();

			System.out.println("Enter Second Number");
			double secondNumber = scr.nextDouble();
			
			double result = firstNumber + secondNumber;
			System.out.println("Total:"+result);
			
			System.out.println("Do you want to start again? Enter True or False");
			again=scr.nextBoolean();
		}while(again);
		scr.close();

	}

}
