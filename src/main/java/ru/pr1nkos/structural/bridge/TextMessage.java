package ru.pr1nkos.structural.bridge;

/**
 * The type Text message.
 */
public class TextMessage extends Message {

    /**
     * Instantiates a new Text message.
     *
     * @param messageSender the message sender
     */
    public TextMessage(MessageSender messageSender) {
        super(messageSender);
    }

    @Override
    public void send(String message) {
        sender.sendMessage(message);
    }
}
