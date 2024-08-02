package ru.pr1nkos.creational.abstractfactory;

/**
 * The type Windows button.
 */
public class WindowsButton implements Button {

    @Override
    public void paint() {
        System.out.println("Painting Windows Button");
    }
}
