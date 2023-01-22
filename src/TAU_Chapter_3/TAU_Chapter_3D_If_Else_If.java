package TAU_Chapter_3;

import java.util.Scanner;

public class TAU_Chapter_3D_If_Else_If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your marks");
		Scanner scr = new Scanner (System.in);
		double marks = scr.nextDouble();
		scr.close();
		
		char grade;
		
		if(marks < 60) {
			grade = 'F';
		}
		else if(marks < 70) {
			grade = 'D';
		}
		else if(marks < 80) {
			grade = 'C';
		}
		else if(marks < 90) {
			grade = 'B';
		}
		else if(marks < 100) {
			grade = 'A';
		}
		else if(marks == 100) {
			grade ='G';
		}
		else {
			grade = '0';
		}
		
		System.out.println("You have got:" + grade);
	}

}
