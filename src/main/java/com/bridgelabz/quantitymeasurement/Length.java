package com.bridgelabz.quantitymeasurement;

public class Length {
    private double length;

    public Length(double length, Unit unit) {
        this.length = unit.convertToBase(length);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length length1 = (Length) o;
        return Double.compare(length1.length, length) == 0;
    }
}
