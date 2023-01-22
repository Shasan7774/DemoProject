package TAU_Chapter_5;

import java.util.Scanner;

public class TAU_Chapter_5b_PhoneBillCalculator2_Solve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Enter base cost of the plan");
		double baseCost = scanner.nextDouble();
		
		System.out.println("Enter plan fee");
		double overageMinutes = scanner.nextDouble();
		
		scanner.close();
		
		double overageCharge = calculateOverageFees(overageMinutes);
		
		double tax = calculateTax (baseCost + overageMinutes);
		
		calculateAndPrintbill(baseCost, overageCharge, tax);

	}

	public static double calculateOverageFees(double extraMinutes) {
		double rate = 0.25;
		double overage = rate * extraMinutes;
		return overage;
		
	}
	
	public static double calculateTax(double subtotal) {
		double taxrate = 0.15;
		double tax = taxrate * subtotal;
		return tax;
		
	}
	
	public static void calculateAndPrintbill(double base, double overage, double tax) {
		double finalTotal = base + overage + tax;
		
		System.out.println("Phone Bill Statement:");
		System.out.println("Plan:" + base);
		System.out.println("Overage Minutes:" +overage);
		System.out.println("Tax:" + tax);
		System.out.println("Total Cost of the PHone Call:" + finalTotal);
	
	}

}
