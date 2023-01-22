package TAU_Chapter_5;

import java.util.Scanner;
  public class TAU_Chapter_5b_PhoneBillCalculator {
  
  static double planCost; 
  static int overageMinutes; 
  static double overage;
  static double tax; 
  static double total;
  
  
  public static void main(String[] args) { // TODO Auto-generated method stub
  
	  System.out.println("Enter base cost of the plan:"); 
	  Scanner scanner = new Scanner(System.in); 
	  planCost = scanner.nextDouble();
  
	  System.out.println("Enter overage minutes:"); 
	  overageMinutes = scanner.nextInt();
  
	  scanner.close();
  
	  overagefees();
	  calculateTax();
	  finaltotal();
  
  
  }
  
  public static void overagefees() { 
	  overage = 0.25 * overageMinutes;
	  System.out.println("Overage Fees:" +overage);
  
  } 
  public static void calculateTax() { 
	  tax = (planCost + overage)*0.15;
	  System.out.println("Tax:" +tax);
  
  }
  
  public static void finaltotal() { 
	  total = planCost + overage + tax;
	  System.out.println("Total Cost with 15% vat is:" +total);
  
  }
  
  }
  
  
 
