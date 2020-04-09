package com.bridgelabz.quantitymeasurement;

public enum Unit {
    FEET(12), YARD(36), INCH(1);

    double toBase;

    Unit(double toBase) {
        this.toBase = toBase;
    }

    public double convertToBase(double length) {
        return length * this.toBase;
    }
}
