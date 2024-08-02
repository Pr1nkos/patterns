package ru.pr1nkos.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Blog.
 */
public class Blog {
    private String title;
    private List<Observer> observers = new ArrayList<Observer>();

    /**
     * Add observer.
     *
     * @param observer the observer
     */
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * Remove observer.
     *
     * @param observer the observer
     */
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * Notify observers.
     */
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(title);
        }
    }

    /**
     * Publish.
     *
     * @param title the title
     */
    public void publish(String title) {
        this.title = title;
        notifyObservers();
    }
}
