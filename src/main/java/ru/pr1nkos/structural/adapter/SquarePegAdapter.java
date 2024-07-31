package ru.pr1nkos.structural.adapter;

public class SquarePegAdapter extends RoundPeg{
    private SquarePeg squarePeg;

    public SquarePegAdapter(SquarePeg squarePeg) {
        super(squarePeg.getSide() * Math.sqrt(2)/2);
        this.squarePeg = squarePeg;
    }
}
