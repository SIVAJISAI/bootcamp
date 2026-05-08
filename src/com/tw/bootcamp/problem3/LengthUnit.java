package com.tw.bootcamp.problem3;

public enum LengthUnit implements Unit {
    In,
    Ft,
    Cm,
    Mm;

     @Override
     public double convertToBase(double value){
        return switch (this){
            case In -> (value);
            case Ft -> (value * 12 );
            case Cm -> (value*1/2.5 );
            case Mm-> (value * 1/25 );
        };
    }

}
