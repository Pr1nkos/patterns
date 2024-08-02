package ru.pr1nkos.creational.prototype;

import lombok.Data;

/**
 * The type Shape.
 */
@Data
public abstract class Shape implements Cloneable{
    private String id;
    /**
     * The Type.
     */
    protected String type;

    /**
     * Draw.
     */
    public abstract void draw();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object clone = null;
        try{
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
