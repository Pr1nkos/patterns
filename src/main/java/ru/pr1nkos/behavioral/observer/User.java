package ru.pr1nkos.behavioral.observer;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class User implements Observer {
    private String name;

    @Override
    public void update(String message) {
        System.out.println(name + " received title: " + message);
    }
}
