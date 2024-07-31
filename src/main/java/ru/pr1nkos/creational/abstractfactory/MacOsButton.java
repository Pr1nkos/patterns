package ru.pr1nkos.creational.abstractfactory;

public class MacOsButton implements Button {

    @Override
    public void paint() {
        System.out.println("Drawing MacOs Button");
    }
}
