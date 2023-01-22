package TAU_Chapter_3;

import java.util.Scanner;

public class TAU_Chapter_3E_Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your grade:");
		Scanner scr = new Scanner(System.in);
		String grade = scr.next();
		scr.close();
		String message;
		
		switch(grade) {
		case "A":
			message = "Yahoo!";
			break;
			
		case "B":
			message= "Good Job!";
			break;
			
		case "C":
			message= "Thats OK! Try Harder";
			break;
			
		case "F":
			message="Uh Oh!";
			break;
				
		default:
			message = "Try again!";
			break;
		
		}
		
		System.out.println(message);
		
		
	}

}
