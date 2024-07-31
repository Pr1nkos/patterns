package ru.pr1nkos.structural.bridge;

public class EncryptedMessage extends Message {

    public EncryptedMessage(MessageSender messageSender) {
        super(messageSender);
    }

    @Override
    public void send(String message) {
        sender.sendMessage(encrypt(message));
    }

    private String encrypt(String message) {
        return "Encrypted Message: " + message;
    }
}
