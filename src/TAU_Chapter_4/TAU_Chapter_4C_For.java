package TAU_Chapter_4;

import java.util.Scanner;

public class TAU_Chapter_4C_For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number of items");
		Scanner scr = new Scanner (System.in);
		int quantity = scr.nextInt();
		
		double total = 0;
		
		for(int i=0; i<quantity;i++) {
		System.out.println("Enter Price");
		double price = scr.nextDouble();
		total = total + price;
		
		
		}
		scr.close();
		System.out.println("Total Price is:"+total);

	}

}
