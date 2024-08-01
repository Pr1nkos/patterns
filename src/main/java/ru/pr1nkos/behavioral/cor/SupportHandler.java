package ru.pr1nkos.behavioral.cor;

import lombok.Setter;

@Setter
public abstract class SupportHandler {
    protected SupportHandler supportHandler;

    public abstract void handleRequest(String request);
}
