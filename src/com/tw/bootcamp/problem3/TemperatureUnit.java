package com.tw.bootcamp.problem3;

public enum TemperatureUnit {
    F,
    C;

    public double convertToBase(double value){
        return  switch (this){
            case F -> value;
            case C -> ((value * 1.8) + 32.0);
        };
    }
}
