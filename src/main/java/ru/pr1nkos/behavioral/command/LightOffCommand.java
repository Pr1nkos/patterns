package ru.pr1nkos.behavioral.command;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class LightOffCommand implements Command {
    Light light;

    @Override
    public void execute() {
        light.off();
    }
}
