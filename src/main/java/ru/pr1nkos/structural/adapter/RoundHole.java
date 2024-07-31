package ru.pr1nkos.structural.adapter;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class RoundHole {
    private double radius;

    public boolean fits (RoundPeg roundPeg) {
        return this.radius >= roundPeg.getRadius();
    }
}
