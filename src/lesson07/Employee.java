package lesson07;

public class Employee {
	private String name;
	private String lastName;
	private String gender;
	private int salary;
	private int bill;
	
	public Employee(String name, String lastName, String gender, int salary) {
		this.name = name;
		this.gender = gender;
		this.lastName = lastName;
		this.salary = salary;
	}
	
	public int getBill() {
		return bill;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void giveReducedSalary(int least) {
		if(least >= salary) {
			return;
		}
		this.bill += least;
	}
	
	public void giveSalary() {
		this.bill += salary;
	}
	
	public String getName() {
		return name;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String toString() {
		return "name:" + name + " lastname: " + lastName + " gender: " + gender + " ";
	}
	
}
