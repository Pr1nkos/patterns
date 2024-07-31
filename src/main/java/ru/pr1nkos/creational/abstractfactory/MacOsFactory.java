package ru.pr1nkos.creational.abstractfactory;

public class MacOsFactory implements GuiFactory{

    @Override
    public Button createButton() {
        return new MacOsButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacOsCheckBox();
    }
}
