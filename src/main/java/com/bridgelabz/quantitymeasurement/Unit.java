package com.bridgelabz.quantitymeasurement;

public enum Unit {

    INCH(Entity.LENGTH,1), FEET(Entity.LENGTH,12), YARD(Entity.LENGTH,36)
    , CENTIMETER(Entity.LENGTH,0.4), LITRE(Entity.VOLUME,1), GALLON(Entity.VOLUME,3.78);

    double toBase;
    Entity entity;

    enum Entity{
        LENGTH, VOLUME;
    }

    Unit(Entity entity, double toBase) {
        this.toBase = toBase;
        this.entity = entity;
    }

    public double convertToBase(double quantity) {
        return quantity * this.toBase;
    }
}
