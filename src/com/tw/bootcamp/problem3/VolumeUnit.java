package com.tw.bootcamp.problem3;

public enum VolumeUnit implements Unit {
    Lt,
    Gal;
    @Override
     public double convertToBase(double value) {
         return switch (this) {
             case Lt -> value;
             case Gal -> value * 3.78;
         };
     }

}
