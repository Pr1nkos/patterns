package ru.pr1nkos.creational.prototype;

public class Circle extends Shape {
    public Circle() {
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}
