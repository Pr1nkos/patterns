package ru.pr1nkos.behavioral.mediator;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class User {
    protected String name;
    protected ChatMediator mediator;

    public abstract void sendMessage(String message);
    public abstract void receiveMessage(String message);
}
