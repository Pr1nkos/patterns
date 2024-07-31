package ru.pr1nkos.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CompanyDirectory implements Employee{
    private List<Employee> employees = new ArrayList<Employee>();

    @Override
    public void showEmployeeDetails() {
        for (Employee employee : employees) {
            employee.showEmployeeDetails();
        }
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }
}
