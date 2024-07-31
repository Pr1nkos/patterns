package ru.pr1nkos.creational.prototype;

import lombok.SneakyThrows;

import java.util.HashMap;
import java.util.Map;

public class ShapeCache {
    private static final Map<String, Shape> cache = new HashMap<>();

    @SneakyThrows
    public static Shape getShape(String shapeName) {
        Shape shape = cache.get(shapeName);
        return (Shape) shape.clone();
    }

    private ShapeCache() {
    }

    public static void loadCache(){
        Circle circle = new Circle();
        circle.setId("1");
        cache.put(circle.getType(), circle);

        Square square = new Square();
        square.setId("2");
        cache.put(square.getType(), square);
    }
}
