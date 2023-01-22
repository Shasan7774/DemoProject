package TAU_Chapter_7;

import java.util.Random;
import java.util.Scanner;

public class Random_Number_Generator {
	public static void main(String[] args) {
		System.out.println("Enter the number of length array");
		Scanner scr = new Scanner(System.in);
		int size = scr.nextInt();
		scr.close();
		int newArray[] = new int[size];
		
		Random rand = new Random();
		for (int i =0; i<size; i++) {
			newArray[i] = rand.nextInt(10); 
		}
		System.out.println("Inserted Random Numbers");
		for (int j=0; j<size;j++) {
			System.out.print(newArray[j]+"\t");
		}
		
	}
	
}
