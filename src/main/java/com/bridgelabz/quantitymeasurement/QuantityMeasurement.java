package com.bridgelabz.quantitymeasurement;

public class QuantityMeasurement {
    public boolean compare(Feet feet1, Feet feet2) {
        if(feet1.equals(feet2))
            return true;
        return false;
    }

    public boolean compare(Inch inch1, Inch inch2) {
        if(inch1.equals(inch2))
            return true;
        return false;
    }
}