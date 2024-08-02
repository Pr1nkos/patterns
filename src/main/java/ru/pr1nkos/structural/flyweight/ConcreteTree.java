package ru.pr1nkos.structural.flyweight;

/**
 * The type Concrete tree.
 */
public class ConcreteTree implements Tree {
    private String type;

    /**
     * Instantiates a new Concrete tree.
     *
     * @param type the type
     */
    public ConcreteTree(String type) {
        this.type = type;
        System.out.println("Creating tree of type " + type);
    }

    @Override
    public void display(int x, int y) {
        System.out.println("Displaying tree of type " + type + " at " + x + ", " + y);
    }
}
