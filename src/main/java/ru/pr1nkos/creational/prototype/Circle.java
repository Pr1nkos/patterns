package ru.pr1nkos.creational.prototype;

/**
 * The type Circle.
 */
public class Circle extends Shape {
    /**
     * Instantiates a new Circle.
     */
    public Circle() {
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}
