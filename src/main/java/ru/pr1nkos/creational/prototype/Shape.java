package ru.pr1nkos.creational.prototype;

import lombok.Data;

@Data
public abstract class Shape implements Cloneable{
    private String id;
    protected String type;

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
