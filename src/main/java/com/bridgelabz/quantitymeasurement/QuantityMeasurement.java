package com.bridgelabz.quantitymeasurement;

public class QuantityMeasurement {

    public boolean compare(Length length1, Length length2) {
        if (length1.equals(length2))
            return true;
        return false;
    }

    public double add(Length length1, Length length2) {
        return length1.length + length2.length;
    }
}