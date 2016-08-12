package lesson08_Homework;

import java.util.List;

/**
 * Created by punchCleric on 10.08.2016.
 */
public class Department {
    private String DepartmentName;
    private List<Employee> DepartmentWorkerList;
    private Manager manager;

    public Department(String DepartmentName, Manager manager) {
        this.DepartmentName = DepartmentName;
        this.manager = manager;
    }


    public List<Employee> getDepartmentWorkerList() {
        return DepartmentWorkerList;
    }
}
