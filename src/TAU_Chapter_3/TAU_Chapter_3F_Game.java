package TAU_Chapter_3;

import java.util.Scanner;

public class TAU_Chapter_3F_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("how many 10 would you like?");
		Scanner scr = new Scanner(System.in);
		int ten = scr.nextInt();
		ten=ten * 10;
		
		System.out.println("how many 20 would you like?");
		int twenty = scr.nextInt();
		twenty=twenty*20;
		
		System.out.println("how many 50 would you like?");
		int fifty = scr.nextInt();
		fifty=fifty*50;
		
		System.out.println("how many 100 would you like?");
		int hundred = scr.nextInt();
		hundred=hundred*100;
		
		scr.close();
		
		int actual_century = ten + twenty + fifty + hundred;
		int real_century = 100;
		int up_value = actual_century-real_century;
		int down_value = real_century-actual_century;
		
		if(actual_century==100) {
			System.out.println("Congratulaions! You Win");
		}
		else if(actual_century>100) {
			System.out.println("You went over: "+ up_value + " Try again!");
		}
		
		else if(actual_century<100){
			System.out.println("You went down: "+ down_value + " Try again!");
		}
		else {
			System.out.println("You are doomed!");
		}

		
	}
	

}

/*
 * package exercises.chapter3;

import java.util.Scanner;

public class ChangeForADollarGame {

    public static void main(String args[]){

        double penny = .01;
        double nickel = .05;
        double dime = .10;
        double quarter = .25;
        int dollar = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to 'Change for a Dollar'! " +
                "Your goal is to enter enough change to make exactly $1.00");

        System.out.println("Enter your number of pennies:");
        int numOfPennies = scanner.nextInt();

        System.out.println("Enter your number of nickels:");
        int numOfNickels = scanner.nextInt();

        System.out.println("Enter your number of dimes:");
        int numOfDimes = scanner.nextInt();

        System.out.println("Enter your number of quarters:");
        int numOfQuarters = scanner.nextInt();

        scanner.close();

        double total = numOfPennies * penny + numOfNickels * nickel + numOfDimes * dime + numOfQuarters * quarter;

        if(total < dollar){
            double amountShort = dollar - total;

            //Way to make the decimal print with only 2 decimal places
            System.out.println("Sorry, you lose! You were short " + String.format("%.2f", amountShort) + " cents.");
        }
        else if(total > dollar){
            double amountOver = total - dollar;

            //Way to make the decimal print with only 2 decimal places
            System.out.println("Sorry, you lose! You were over " + String.format("%.2f", amountOver) + " cents.");
        }
        else{
            System.out.println("Yay! That's exactly $1.00! You win!");
        }
    }
}
 */
