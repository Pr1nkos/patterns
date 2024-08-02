package ru.pr1nkos.creational.abstractfactory;

/**
 * The interface Gui factory.
 */
public interface GuiFactory {
    /**
     * Create button button.
     *
     * @return the button
     */
    Button createButton();

    /**
     * Create check box check box.
     *
     * @return the check box
     */
    CheckBox createCheckBox();
}
