package ru.pr1nkos.structural.bridge;

public abstract class Message {
    protected MessageSender sender;

    protected Message(MessageSender sender) {
        this.sender = sender;
    }

    public abstract void send(String message);
}
