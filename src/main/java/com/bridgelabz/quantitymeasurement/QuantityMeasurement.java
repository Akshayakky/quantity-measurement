package com.bridgelabz.quantitymeasurement;

public class QuantityMeasurement {

    enum LengthUnits {
        FEET, INCH;
    }

    public boolean compare(Length length1, Length length2) {
        if (length1.equals(length2))
            return true;
        return false;
    }
}