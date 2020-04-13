package com.bridgelabz.quantitymeasurement;

public interface IBaseUnit {
    double convertToBase(double quantity);

    default double convertToBase(double quantity, double toBase) {
        return quantity * toBase;
    }
}
