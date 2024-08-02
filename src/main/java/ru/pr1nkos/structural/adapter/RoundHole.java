package ru.pr1nkos.structural.adapter;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * The type Round hole.
 */
@AllArgsConstructor
@Getter
public class RoundHole {
    private double radius;

    /**
     * Fits boolean.
     *
     * @param roundPeg the round peg
     * @return the boolean
     */
    public boolean fits (RoundPeg roundPeg) {
        return this.radius >= roundPeg.getRadius();
    }
}
