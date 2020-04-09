package com.bridgelabz.quantitymeasurement;

public enum Unit {
    FEET(12), YARD(36), INCH(1), CENTIMETER(0.4);

    double toBase;

    Unit(double toBase) {
        this.toBase = toBase;
    }

    public double convertToBase(double quantity) {
        return quantity * this.toBase;
    }
}
