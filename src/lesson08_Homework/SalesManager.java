package lesson08_Homework;

import java.util.List;

/**
 * Created by punchCleric on 10.08.2016.
 */
public class SalesManager extends Employee {
    private String name;
    private String lastname;
    private String middlename;
    private String gender;
    private int salary;
    private int bill;
    private int sales;
    private Department department;


    public SalesManager(String name, String lastname, String gender,String middlename, int salary) {
        super(name, lastname, middlename, gender, salary);
    }

    public void work(int sales) {
        this.sales += sales;
    }

    @Override
    public void giveSalary() {
        bill += salary + (0.3 * sales);
        sales = 0;
    }

}
