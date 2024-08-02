package ru.pr1nkos.behavioral.command;


import lombok.Setter;

/**
 * The type Remote control.
 */
@Setter
public class RemoteControl {
    private Command command;

    /**
     * Press button.
     */
    public void pressButton(){
        command.execute();
    }
}
