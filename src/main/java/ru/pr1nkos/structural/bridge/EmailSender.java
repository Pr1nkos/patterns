package ru.pr1nkos.structural.bridge;

public class EmailSender implements MessageSender {

    @Override
    public void sendMessage(String message) {
        System.out.println("Email message:" + message);
    }
}
