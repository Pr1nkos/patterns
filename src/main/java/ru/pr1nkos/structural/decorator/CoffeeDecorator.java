package ru.pr1nkos.structural.decorator;

import lombok.AllArgsConstructor;

@AllArgsConstructor
abstract class CoffeeDecorator implements Coffee {
    protected Coffee coffee;

    @Override
    public String getDescription() {
        return coffee.getDescription();
    }

    @Override
    public double getCost() {
        return coffee.getCost();
    }
}
