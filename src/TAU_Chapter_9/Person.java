package TAU_Chapter_9;

public class Person {
	private String name;
	private int age;
	private String gender;
	
	public Person() {
		System.out.println("Default Constructor Person");
	}
	
	public Person(String name) {
		System.out.println("2nd Constructor Person");
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getGender() {
		return gender;
	}
	
	public void printPersonInfo() {
		System.out.println("Person Details:");
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Gender: "+gender);
		
	}


}
