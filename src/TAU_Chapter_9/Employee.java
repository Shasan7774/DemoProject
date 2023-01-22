package TAU_Chapter_9;

public class Employee extends Person {
	
	private int empId;
	private String empTitle ;
	private double salary;
	
	public Employee() {
		super("Fahim");
		System.out.println("Employee Default Constructor");
	}
	
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public int getEmpId() {
		return empId;
	}
	
	public void setEmpTitle(String empTitle) {
		this.empTitle = empTitle;
	}
	public String getEmpTitle() {
		return empTitle;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}
	
	public void printEmployeeInfo() {
		System.out.println("Employee Details");
		System.out.println("Employee ID: "+empId);
		System.out.println("Job Title: "+empTitle);
		System.out.println("Salary: "+salary);
		
	}


}
