package com.bridgelabz.quantitymeasurement;

public class Length {

    private double length;
    private QuantityMeasurement.LengthUnits unit;

    public Length(double length, QuantityMeasurement.LengthUnits unit) {
        if (unit == QuantityMeasurement.LengthUnits.YARD)
            this.length = 36 * length;
        else if (unit == QuantityMeasurement.LengthUnits.FEET)
            this.length = 12 * length;
        else
            this.length = length;
        this.unit = QuantityMeasurement.LengthUnits.INCH;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length length1 = (Length) o;
        return Double.compare(length1.length, length) == 0 &&
                unit == length1.unit;
    }
}
