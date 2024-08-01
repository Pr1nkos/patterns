package ru.pr1nkos.structural.bridge;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Message {
    protected MessageSender sender;

    public abstract void send(String message);
}
