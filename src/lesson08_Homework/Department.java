package lesson08_Homework;

import java.util.ArrayList;
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

    public String getDepartmentName() {
        return DepartmentName.toString();
    }


    protected Manager getManager() {
        return manager;
    }


    public List<Employee> getDepartmentWorkerList() {
        return  DepartmentWorkerList;
    }

    public boolean addEmployee(Employee empl) {
        for(int i = 0; i < DepartmentWorkerList.size(); i++) {
            if(DepartmentWorkerList.get(i).getInfo() == empl.getInfo())
                return false;
        }
        DepartmentWorkerList.add(empl);
        return true;
    }

    public boolean fireEmployee(String name, String lastname, String patronymic) {
        String tmp = name + lastname + patronymic;
        for(int i = 0; i < DepartmentWorkerList.size(); i++) {
            if(DepartmentWorkerList.get(i).getInfo() == tmp.toLowerCase())
                DepartmentWorkerList.remove(i);
            return true;
        }
        return  false;
    }

    public boolean setManager(Manager manager) {
        if(this.manager != null) {
            return false;
        } else
            this.manager = manager;
            return true;
    }

    public boolean fireManager() {
        if(this.manager == null)
            return false;
        else
            this.manager = null;
            return true;
    }



}
