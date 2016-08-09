package lesson07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Firm {
	private String firmName;
	private String address;
	private int firmBill;
	ArrayList<Employee> list = new ArrayList<Employee>();
	
	public Firm() {
		
	}
	
	public Firm(String firmName, String address) {
		this.firmName = firmName;
		this.address = address;
	}
	
	public void earnMoney(int value) {
		firmBill += value;
	}

	
	public boolean add(Employee empl) {
		for(int i = 0; i < list.size(); i++){
			if(empl.getName().equalsIgnoreCase(list.get(i).getName())  && empl.getLastName().equalsIgnoreCase(list.get(i).getLastName())) {
				return false;
			}
		}
		list.add(empl);
		return true;
	}
	
	public boolean fireEmployee(String name, String lastName) {
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getName().equalsIgnoreCase(name) && list.get(i).getLastName().equalsIgnoreCase(lastName)){
				list.remove(i);
				return true; 
			}
		}
		return false;
	}
	
	public void giveSalaryForAll() {
		for(int i = 0; i < list.size(); i++) {
			if(firmBill > list.get(i).getSalary()) {
				firmBill = firmBill - list.get(i).getSalary();
				list.get(i).giveSalary();
			} else {
				list.get(i).giveReducedSalary(firmBill);
				firmBill = 0;
				return;
			}
		}
	}
	
	public ArrayList<Employee> getAll() {
		return new ArrayList<>(list);
	}
	
	
	public ArrayList<Employee> getAllSortedBySalary() {
		ArrayList<Employee> newList = new ArrayList<>(list);
		
		Collections.sort(newList, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				int a = o1.getSalary();
				int b = o2.getSalary();
				return a < b? 1 : a == b? 0 : -1;
			}
		});
		
		return newList;
	}
	
	
	public static void main(String[] args) {
		Firm firm = new Firm("Hasbro", "Owl Street 92");
		
		firm.add(new Employee("Luck", "Lowe", "male", 1000));
		firm.add(new Employee("David", "Lowe", "male", 5000));
		firm.add(new Employee("Luck", "Tix", "male", 2000));
		
		//System.out.println(firm.getSortedList());
		System.out.println(firm.list);
		//firm.list.remove(firm.list.get(0));
		System.out.println(firm.getAllSortedBySalary());
		//System.out.println(firm.getAll());
		
	}
	
}
