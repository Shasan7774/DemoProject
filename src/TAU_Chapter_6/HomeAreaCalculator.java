package TAU_Chapter_6;
//6c
import java.util.Scanner;

public class HomeAreaCalculator {
	private Scanner scr = new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HomeAreaCalculator calculator = new HomeAreaCalculator();
		Rectangle kitchen = calculator.getRoom();
		Rectangle bathroom = calculator.getRoom();
		
		double area = calculator.calculateTotalArea(kitchen, bathroom);
		System.out.println("Total Area Of The Room Is:"+area);
		
		calculator.scr.close();
		

	}
	
	public Rectangle getRoom() {
		
		
		System.out.println("Enter the length of your Room");
		double length = scr.nextDouble();
		
		System.out.println("Enter the width of your Room");
		double width = scr.nextDouble();
		
		
		
		
		/*
		 * TAU_Chapter_6a_Rectangle room = new TAU_Chapter_6a_Rectangle(length,width);
		 * return room;
		 */
		return new Rectangle(length,width);
	}
	public double calculateTotalArea(Rectangle rect1, Rectangle rect2) {
		return rect1.calculateArea() + rect2.calculateArea();
		
	}

}
