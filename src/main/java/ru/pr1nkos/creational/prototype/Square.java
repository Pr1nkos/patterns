package ru.pr1nkos.creational.prototype;

/**
 * The type Square.
 */
public class Square extends Shape {
    /**
     * Instantiates a new Square.
     */
    public Square() {
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Draw square");
    }
}
