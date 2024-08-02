package ru.pr1nkos.creational.abstractfactory;

/**
 * The type Mac os factory.
 */
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
