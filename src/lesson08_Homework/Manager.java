package lesson08_Homework;

import java.util.List;

/**
 * Created by punchCleric on 10.08.2016.
 */
public class Manager extends Employee {

    private String name;
    private String lastname;
    private  String patronymic;
    private String gender;
    private int salary;
    private int bill;
    private Department department;

    public Manager(String name, String lastname, String gender,String patronymic, int salary) {
        super(name, lastname, patronymic, gender, salary);
    }

    @Override
    public void giveSalary() {
        bill += salary + (department.getDepartmentWorkerList().size() * 50);
    }
}
