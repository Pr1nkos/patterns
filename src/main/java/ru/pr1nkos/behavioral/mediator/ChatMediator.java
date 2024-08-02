package ru.pr1nkos.behavioral.mediator;

import java.nio.file.attribute.UserPrincipal;

/**
 * The interface Chat mediator.
 */
public interface ChatMediator {
    /**
     * Send message.
     *
     * @param message the message
     * @param user    the user
     */
    void sendMessage(String message, User user);

    /**
     * Add user.
     *
     * @param user the user
     */
    void addUser(User user);
}
