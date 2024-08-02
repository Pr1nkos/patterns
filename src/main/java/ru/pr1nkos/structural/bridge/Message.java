package ru.pr1nkos.structural.bridge;

import lombok.AllArgsConstructor;

/**
 * The type Message.
 */
@AllArgsConstructor
public abstract class Message {
    /**
     * The Sender.
     */
    protected MessageSender sender;

    /**
     * Send.
     *
     * @param message the message
     */
    public abstract void send(String message);
}
