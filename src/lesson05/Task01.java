package lesson05;



class Car {
	public String mark;
}

class Person {
	String name;
	int age;
	public void info() {
		System.out.println(name + " " + age);
	}
}

public class Task01 {
	public static void printPerson(Person p) {
		System.out.println(p.name + " " + p.age);
	}
	
	public static void main(String[] args) {
		Person Rick = new Person();
		printPerson(Rick);
		Rick.info();
	}
}
