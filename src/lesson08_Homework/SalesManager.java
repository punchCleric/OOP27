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
    private Department department;


    public SalesManager(String name, String lastname, String gender,String middlename, int salary) {
        super(name, lastname, middlename, gender, salary);
    }

}
