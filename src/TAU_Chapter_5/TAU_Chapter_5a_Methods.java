package TAU_Chapter_5;

import java.util.Scanner;

public class TAU_Chapter_5a_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your name");
		Scanner scr = new Scanner (System.in);
		String name = scr.next();
		scr.close();
		greetUser(name);

	}
	
	
	public static void greetUser(String name) {
		System.out.println("Hi Welcome!!" + name);
	}

}
