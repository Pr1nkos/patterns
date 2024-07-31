package ru.pr1nkos.creational.prototype;

public class Square extends Shape {
    public Square() {
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Draw square");
    }
}
