package ru.pr1nkos.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Company directory.
 */
public class CompanyDirectory implements Employee{
    private List<Employee> employees = new ArrayList<Employee>();

    @Override
    public void showEmployeeDetails() {
        for (Employee employee : employees) {
            employee.showEmployeeDetails();
        }
    }

    /**
     * Add employee.
     *
     * @param employee the employee
     */
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    /**
     * Remove employee.
     *
     * @param employee the employee
     */
    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }
}
