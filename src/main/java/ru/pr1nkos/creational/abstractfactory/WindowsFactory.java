package ru.pr1nkos.creational.abstractfactory;

public class WindowsFactory implements GuiFactory{

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowsCheckBox();
    }
}
