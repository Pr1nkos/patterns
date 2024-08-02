package ru.pr1nkos.structural.decorator;

import lombok.AllArgsConstructor;
import lombok.experimental.SuperBuilder;


/**
 * The type Milk decorator.
 */
public class MilkDecorator extends CoffeeDecorator{
    /**
     * Instantiates a new Milk decorator.
     *
     * @param coffee the coffee
     */
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Milk";
    }

    @Override
    public double getCost() {
        return super.getCost() + 1.5;
    }
}
