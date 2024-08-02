package ru.pr1nkos.structural.decorator;

/**
 * The type Simple coffee.
 */
public class SimpleCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "Simple Coffee";
    }

    @Override
    public double getCost() {
        return 5.0;
    }


}
