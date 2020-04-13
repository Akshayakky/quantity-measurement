package com.bridgelabz.quantitymeasurement;

public enum Unit implements IBaseUnit {

    INCH(UnitType.LENGTH, 1), FEET(UnitType.LENGTH, 12)
    , YARD(UnitType.LENGTH, 36), CENTIMETER(UnitType.LENGTH, 0.4)
    , LITRE(UnitType.VOLUME, 1), GALLON(UnitType.VOLUME, 3.78)
    , MILLILITRE(UnitType.VOLUME,0.001), KILOGRAMS(UnitType.WEIGHT,1)
    , GRAMS(UnitType.WEIGHT, 0.001), TONNE(UnitType.WEIGHT, 1000)
    , FAHRENHEIT(UnitType.TEMPERATURE,1), CELCIUS(UnitType.TEMPERATURE, 1);

    double toBase;
    UnitType unitType;

    Unit(UnitType unitType, double toBase) {
        this.toBase = toBase;
        this.unitType = unitType;
    }

    @Override
    public double convertToBase(double quantity) {
        return IBaseUnit.super.convertToBase(quantity, toBase);
    }
}
