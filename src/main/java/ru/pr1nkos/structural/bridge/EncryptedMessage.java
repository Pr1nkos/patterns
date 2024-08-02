package ru.pr1nkos.structural.bridge;

/**
 * The type Encrypted message.
 */
public class EncryptedMessage extends Message {

    /**
     * Instantiates a new Encrypted message.
     *
     * @param messageSender the message sender
     */
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
