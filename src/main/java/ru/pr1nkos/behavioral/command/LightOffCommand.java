package ru.pr1nkos.behavioral.command;

import lombok.AllArgsConstructor;

/**
 * The type Light off command.
 */
@AllArgsConstructor
public class LightOffCommand implements Command {
    /**
     * The Light.
     */
    Light light;

    @Override
    public void execute() {
        light.off();
    }
}
