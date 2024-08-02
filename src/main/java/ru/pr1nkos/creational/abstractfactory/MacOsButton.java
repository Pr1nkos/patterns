package ru.pr1nkos.creational.abstractfactory;

/**
 * The type Mac os button.
 */
public class MacOsButton implements Button {

    @Override
    public void paint() {
        System.out.println("Drawing MacOs Button");
    }
}
