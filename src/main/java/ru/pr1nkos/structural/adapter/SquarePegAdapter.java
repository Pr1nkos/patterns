package ru.pr1nkos.structural.adapter;

/**
 * The type Square peg adapter.
 */
public class SquarePegAdapter extends RoundPeg{
    private SquarePeg squarePeg;

    /**
     * Instantiates a new Square peg adapter.
     *
     * @param squarePeg the square peg
     */
    public SquarePegAdapter(SquarePeg squarePeg) {
        super(squarePeg.getSide() * Math.sqrt(2)/2);
        this.squarePeg = squarePeg;
    }
}
