package ru.pr1nkos.structural.composite;

import lombok.AllArgsConstructor;

/**
 * The type Manager.
 */
@AllArgsConstructor
public class Manager implements Employee{
    private String name;
    private long empID;
    private String position;

    @Override
    public void showEmployeeDetails() {
        System.out.println(empID + " " + name + " " + position);
    }
}
