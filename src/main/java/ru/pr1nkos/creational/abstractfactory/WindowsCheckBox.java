package ru.pr1nkos.creational.abstractfactory;

/**
 * The type Windows check box.
 */
public class WindowsCheckBox implements CheckBox {

    @Override
    public void paint() {
        System.out.println("Drawing Windows CheckBox");
    }
}
