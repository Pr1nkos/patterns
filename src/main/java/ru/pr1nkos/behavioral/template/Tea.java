package ru.pr1nkos.behavioral.template;

public class Tea extends Beverage {
    @Override
    void brew() {
        System.out.println("Tea brew");
    }

    @Override
    void addCondiments() {
        System.out.println("Add lemon");
    }
}
