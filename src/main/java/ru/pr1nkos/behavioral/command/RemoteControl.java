package ru.pr1nkos.behavioral.command;


import lombok.Setter;

@Setter
public class RemoteControl {
    private Command command;

    public void pressButton(){
        command.execute();
    }
}
