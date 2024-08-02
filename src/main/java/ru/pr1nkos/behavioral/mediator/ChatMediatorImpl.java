package ru.pr1nkos.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Chat mediator.
 */
public class ChatMediatorImpl implements ChatMediator {
    private final List<User> users = new ArrayList<>();

    @Override
    public void sendMessage(String message, User user) {
        for(User u : users) {
            if(u != user) {
                u.receiveMessage(message);
            }
        }
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }
}
