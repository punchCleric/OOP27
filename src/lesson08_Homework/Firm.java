package lesson08_Homework;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by punchCleric on 13.08.2016.
 */
public class Firm {
    private String firmName;
    private String firmAddress;
    private int firmBill;
    private ArrayList<Employee> employeesList;
    private ArrayList<Department> departmentsList;

    public Firm(String firmName, String firmAddress) {
        employeesList = new ArrayList<>();
        departmentsList = new ArrayList<>();
        this.firmName = firmName;
        this.firmAddress = firmAddress;
    }

    public  ArrayList<Department> getDepartmentsList() {
        return departmentsList;
    }

    public boolean addDepartament(Department department) {
        for(int i = 0; i < departmentsList.size(); i++) {
            if (department.getDepartmentName().toLowerCase() == departmentsList.get(i).getDepartmentName().toLowerCase())
                return false;
        }
        departmentsList.add(department);
        return true;
    }

    public boolean addEmployee(Employee employee) {
        for(int i = 0; i < employeesList.size(); i++) {
            if (employee.getInfo() == employeesList.get(i).getInfo())
                return false;
        }
        employeesList.add(employee);
        return true;
    }

    public boolean fireEmployee(String name, String lastname, String patronymic) {
        String tmp = name + lastname + patronymic;
        for(int i = 0; i < employeesList.size(); i++) {
            if(employeesList.get(i).getInfo() == tmp.toLowerCase()) {
                employeesList.get(i).getDepartment().fireEmployee(name, lastname, patronymic);
                employeesList.remove(i);
                return true;
            }
        }
        return  false;
    }

    public List<Employee> getEmployeeList() {
        return new ArrayList<>(employeesList);
    }

    public static void main(String[] args) {
        Firm Hasbro = new Firm("Hasbro", "Baker str");
        Manager manager = new Manager("Hai", "Le", "male", "Chi", 10000);
        Department department = new Department("NewDep", manager);
        Employee employee = new Employee("Mark", "Hammil", "male", "Nick", 5000);
        Hasbro.addEmployee(employee);
        Hasbro.addEmployee(manager);
        Hasbro.addDepartament(department);

        // Далее некомпилируемый код
        // int a = Hasbro.getDepartmentsList().get(0).getDepartmentWorkerList().size();
        // System.out.println(a);
    }


}
