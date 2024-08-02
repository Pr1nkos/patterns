package ru.pr1nkos.behavioral.command;

import lombok.AllArgsConstructor;

/**
 * The type Light on command.
 */
@AllArgsConstructor
public class LightOnCommand implements Command {
    private Light light;

    @Override
    public void execute() {
        light.on();
    }
}
