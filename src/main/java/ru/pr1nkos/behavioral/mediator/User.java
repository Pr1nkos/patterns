package ru.pr1nkos.behavioral.mediator;

import lombok.AllArgsConstructor;

/**
 * The type User.
 */
@AllArgsConstructor
public abstract class User {
    /**
     * The Name.
     */
    protected String name;
    /**
     * The Mediator.
     */
    protected ChatMediator mediator;

    /**
     * Send message.
     *
     * @param message the message
     */
    public abstract void sendMessage(String message);

    /**
     * Receive message.
     *
     * @param message the message
     */
    public abstract void receiveMessage(String message);
}
