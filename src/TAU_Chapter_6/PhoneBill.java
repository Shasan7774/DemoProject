package TAU_Chapter_6;

public class PhoneBill {
	
	private int id;
	private double baseCost;
	private int allotMinutes;
	private int usedMinuites;
	
	public PhoneBill() {
		id = 0;
		baseCost = 78.85;
		allotMinutes = 50;
		usedMinuites = 90;
	}
	
	public PhoneBill(int id) {
		this.id = id;
		baseCost = 78.85;
		allotMinutes = 50;
		usedMinuites = 90;
		
	}
	public PhoneBill(int id, double baseCost,int allotMinutes, int usedMinuites ) {
		this.id = id;
		this.baseCost = baseCost;
		this.allotMinutes = allotMinutes;
		this.usedMinuites = usedMinuites;
		
	}
	
	public int getID() {
		return id;
	}
	public void etID(int id) {
		this.id = id;
	}
	
	public double getBaseCost() {
		return baseCost;
	}
	public void setBaseCost(int baseCost) {
		this.baseCost = baseCost;
	}
	
	public int getAllotMinutes() {
		return allotMinutes;
	}
	public void setAllotMinutes(int allotMinutes) {
		this.allotMinutes = allotMinutes;
	}
	
	public int getUsedMinuites() {
		return usedMinuites;
	}
	public void setUsedMinuites(int usedMinuites) {
		this.usedMinuites = usedMinuites;
	}
	
	public double overAgeMinutes() {
		if(usedMinuites <= allotMinutes) {
			return 0;
		}
		
		double overageRate = 0.25;
		double overageMinutes = usedMinuites - allotMinutes;
		return overageMinutes * overageRate;		
	}
	public double calculateTax() {
		double taxRate = 0.15;
		return taxRate * (baseCost + overAgeMinutes());
	}
	
	public double calculateTotal() {
		return  baseCost + overAgeMinutes() + calculateTax();
	}
	public void printItemizedBill() {
		System.out.println("Caller ID:" +id);
		System.out.println("Base Cost:" + baseCost);
		System.out.println("Overage Fee:" +overAgeMinutes());
		System.out.println("Tax:"+calculateTax());
		System.out.println("Total Cost:"+calculateTotal());
	}
}
