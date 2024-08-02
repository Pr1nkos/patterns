package ru.pr1nkos.structural.decorator;

/**
 * The type Sugar decorator.
 */
public class SugarDecorator extends CoffeeDecorator{

    /**
     * Instantiates a new Sugar decorator.
     *
     * @param coffee the coffee
     */
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Sugar";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.5;
    }
}
