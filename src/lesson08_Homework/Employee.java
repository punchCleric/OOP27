package lesson08_Homework;

import java.util.List;

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

    public void giveSalary() {
        bill += salary;
    }



}
