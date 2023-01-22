package TAU_Chapter_7;

import java.util.Scanner;

//7C
public class GradeChecker {
	private static int grades[];
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("How many grades you would like to enter?");
		grades = new int [scanner.nextInt()];
		
		getGrades();
		
		System.out.println("Average: "+String.format("%.2f", calculateAverage()));
		System.out.println("Highest grade you achieved:"+ highestNumber());
		System.out.println("Lowest grade you achieved:"+ lowestNumber());

	}
	
	public static void getGrades() {
		for(int i=0; i<grades.length; i++) {
			System.out.println("Enter Grade:"+(i+1));
			grades[i] = scanner.nextInt();
		}
	}
	public static int calculateSum() {
		int sum = 0;
		for(int grade: grades) {
		sum = sum + grade;
		}
		return sum;
	}
	
	public static double calculateAverage() {
		return calculateSum()/ grades.length;
	}
	
	public static int highestNumber() {
		int highest = grades[0];
		for (int grade:grades) {
			if(grade>highest) {
				highest = grade;
			}
		}
		return highest;
	}
	public static int lowestNumber() {
		int lowest = grades[0];
		for (int grade:grades) {
			if(grade<lowest) {
				lowest = grade;
			}
		}
		return lowest;
	}

}
