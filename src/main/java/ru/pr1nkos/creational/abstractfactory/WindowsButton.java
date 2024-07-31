package ru.pr1nkos.creational.abstractfactory;

public class WindowsButton implements Button {

    @Override
    public void paint() {
        System.out.println("Painting Windows Button");
    }
}
