package ru.pr1nkos.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Blog {
    private String title;
    private List<Observer> observers = new ArrayList<Observer>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(title);
        }
    }

    public void publish(String title) {
        this.title = title;
        notifyObservers();
    }
}
