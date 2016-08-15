package lesson08_Homework;


import java.util.StringJoiner;

/**
 * Created by punchCleric on 10.08.2016.
 */
public class Employee {
    private String name;
    private String lastname;
    private String patronymic;
    private String gender;
    private int salary;
    private int bill;
    private Department department;

    public Employee(String name, String lastname, String patronymic, String gender, int salary) {
        this.name = name;
        this.lastname = lastname;
        this.patronymic = patronymic;
        this.gender = gender;
        this.salary = salary;
    }


    private String getName() {
        return name;
    }

    private String getLastname() {
        return lastname;
    }

    private String getGender() {
        return gender;
    }

    private String getPatronymic() {
        return patronymic;
    }

    public int getSalary() {
        int i = salary;
        return i;
    }

    public int getBill() {
        int i = bill;
        return i;
    }

    public void setDepartment(Department department){
        this.department = department;
    }

    public Department getDepartment() {
        return department;
    }

    public void giveSalary() {
        bill += salary;
    }

    public String toString() {
        return "Name: " + getName() + "\nLastname: " + getLastname() + "\nPatronymic: " + getPatronymic() + "\nPost: " + this.getClass();
    }


    protected String getInfo() {
        String info = getName() + getLastname() + getPatronymic();
        return info.toLowerCase();
    }
}
