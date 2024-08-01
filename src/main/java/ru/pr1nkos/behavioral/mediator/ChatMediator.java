package ru.pr1nkos.behavioral.mediator;

import java.nio.file.attribute.UserPrincipal;

public interface ChatMediator {
    void sendMessage(String message, User user);
    void addUser(User user);
}
