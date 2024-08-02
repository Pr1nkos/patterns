package ru.pr1nkos.creational.prototype;

import lombok.SneakyThrows;

import java.util.HashMap;
import java.util.Map;

/**
 * The type Shape cache.
 */
public class ShapeCache {
    private static final Map<String, Shape> cache = new HashMap<>();

    /**
     * Gets shape.
     *
     * @param shapeName the shape name
     * @return the shape
     */
    @SneakyThrows
    public static Shape getShape(String shapeName) {
        Shape shape = cache.get(shapeName);
        return (Shape) shape.clone();
    }

    private ShapeCache() {
    }

    /**
     * Load cache.
     */
    public static void loadCache(){
        Circle circle = new Circle();
        circle.setId("1");
        cache.put(circle.getType(), circle);

        Square square = new Square();
        square.setId("2");
        cache.put(square.getType(), square);
    }
}
