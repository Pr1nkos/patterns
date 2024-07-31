package ru.pr1nkos.creational.abstractfactory;

public class MacOsCheckBox implements CheckBox {

    @Override
    public void paint() {
        System.out.println("Drawing macOs checkbox");
    }
}
