package com.tw.bootcamp.problem2;

import java.util.Objects;

public class Chance {
    private final Double chance;


    private Chance(Double chance) {
        this.chance = chance;
    }

    public static Chance create(Double chance) throws IllegalArgumentException {
        if( chance < 0 || chance >1) throw new IllegalArgumentException();
        return new Chance(chance);
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
        return create(1 - chance);
    }

    public Chance union(Chance c) {
     return  and(c).not();
    }

    public Chance and(Chance c) {
        return create(c.chance * chance);
    }
}
