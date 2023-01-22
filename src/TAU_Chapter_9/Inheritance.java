package TAU_Chapter_9;

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Person p1 = new Person(); p1.setName("Hasan Shahriar"); p1.getName();
		 * p1.setGender("Male"); p1.setAge(25);
		 */
		Employee e1 = new Employee();
		e1.setName("Hasan Shahriar");
		e1.setAge(26);
		e1.setGender("Male");
		
		e1.setEmpId(16878748);
		e1.setEmpTitle("QA Enginer");
		e1.setSalary(38000);
		e1.getName();
		
		e1.printPersonInfo();
		System.out.println();
		e1.printEmployeeInfo();
		
		

	}

}
