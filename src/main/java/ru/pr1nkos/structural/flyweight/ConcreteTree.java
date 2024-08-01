package ru.pr1nkos.structural.flyweight;

public class ConcreteTree implements Tree {
    private String type;

    public ConcreteTree(String type) {
        this.type = type;
        System.out.println("Creating tree of type " + type);
    }

    @Override
    public void display(int x, int y) {
        System.out.println("Displaying tree of type " + type + " at " + x + ", " + y);
    }
}
