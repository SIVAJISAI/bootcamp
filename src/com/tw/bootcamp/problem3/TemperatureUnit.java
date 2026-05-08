package com.tw.bootcamp.problem3;

public enum TemperatureUnit implements  Unit {
    F,
    C;
    @Override
    public double convertToBase(double value){
        return  switch (this){
            case F -> value;
            case C -> ((value * 1.8) + 32.0);
        };
    }
}
