package com.tw.bootcamp.problem2;

import java.util.Objects;

public class Chance {

    private static final int MAX_PROBABILITY = 1;
    private final Double chance;


    public Chance(Double chance) {
        this.chance = chance;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Chance chance1 = (Chance) o;
        return Objects.equals(chance, chance1.chance);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(chance);
    }


    public Chance not() {
        return new Chance(1 - chance);
    }

    public Chance union(Chance c) {
     return  new Chance((c.chance + chance) - (c.chance * chance));
    }
}
