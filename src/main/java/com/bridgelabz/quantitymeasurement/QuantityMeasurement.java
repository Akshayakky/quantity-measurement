package com.bridgelabz.quantitymeasurement;

public class QuantityMeasurement {

    public boolean compare(Quantity quantity1, Quantity quantity2) {
        if (quantity1.equals(quantity2))
            return true;
        return false;
    }

    public double add(Quantity quantity1, Quantity quantity2) {
        return quantity1.quantity + quantity2.quantity;
    }
}