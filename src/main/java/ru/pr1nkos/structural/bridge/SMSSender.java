package ru.pr1nkos.structural.bridge;

/**
 * The type Sms sender.
 */
public class SMSSender implements MessageSender {

    @Override
    public void sendMessage(String message) {
        System.out.println("SMS: " + message);
    }
}
