package ru.pr1nkos.behavioral.mediator;

/**
 * The type User.
 */
public class UserImpl extends User {

    /**
     * Instantiates a new User.
     *
     * @param name     the name
     * @param mediator the mediator
     */
    public UserImpl(String name, ChatMediator mediator) {
        super(name, mediator);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println(this.name + " Sending message: " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println(this.name + " Receiving message: " + message);
    }
}
