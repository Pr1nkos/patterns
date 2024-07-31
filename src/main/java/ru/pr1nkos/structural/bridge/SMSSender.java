package ru.pr1nkos.structural.bridge;

public class SMSSender implements MessageSender {

    @Override
    public void sendMessage(String message) {
        System.out.println("SMS: " + message);
    }
}
