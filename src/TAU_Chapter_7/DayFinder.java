package TAU_Chapter_7;

import java.util.Scanner;

public class DayFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String day[] = {"Saturday", "Sunday","Monday", "Tueday","Wedday","Thuday","Friday"};
		
		System.out.println("Enter the number to see the day");
		Scanner scanner = new Scanner(System.in);	
		int dayNum = scanner.nextInt();
		scanner.close();
		System.out.println("Day of the week:" + day[dayNum-1]);
		
		/*
		 * if (day[dayNum].equals(0)) {
		 * System.out.println("Please Enter a valid input within 1-7"); } // else {
		 * 
		 * }
		 */
		
		
		
		}

}
