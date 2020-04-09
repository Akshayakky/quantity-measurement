package com.bridgelabz.quantitymeasurement;

public enum Unit {

    INCH(Attribute.LENGTH, 1), FEET(Attribute.LENGTH, 12), YARD(Attribute.LENGTH, 36), CENTIMETER(Attribute.LENGTH, 0.4), LITRE(Attribute.VOLUME, 1), GALLON(Attribute.VOLUME, 3.78),
    MILLILITRE(Attribute.VOLUME,0.001);

    double toBase;
    Attribute attribute;

    Unit(Attribute attribute, double toBase) {
        this.toBase = toBase;
        this.attribute = attribute;
    }

    public double convertToBase(double quantity) {
        return quantity * this.toBase;
    }
}
