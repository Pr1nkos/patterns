package ru.pr1nkos.structural.bridge;

public class TextMessage extends Message {

    public TextMessage(MessageSender messageSender) {
        super(messageSender);
    }

    @Override
    public void send(String message) {
        sender.sendMessage(message);
    }
}
