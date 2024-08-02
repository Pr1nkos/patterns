package ru.pr1nkos.structural.bridge;

/**
 * The type Email sender.
 */
public class EmailSender implements MessageSender {

    @Override
    public void sendMessage(String message) {
        System.out.println("Email message:" + message);
    }
}
