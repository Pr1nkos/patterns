package ru.pr1nkos.creational.abstractfactory;

/**
 * The type Mac os check box.
 */
public class MacOsCheckBox implements CheckBox {

    @Override
    public void paint() {
        System.out.println("Drawing macOs checkbox");
    }
}
