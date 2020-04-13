package com.bridgelabz.quantitymeasurement;

public class Quantity {
    public double quantity;
    public UnitType unitType;

    public Quantity(double quantity, Unit unit) {
        if (unit.unitType == UnitType.TEMPERATURE)
            this.quantity = (unit == Unit.FAHRENHEIT) ? (quantity - 32) * 5 / 9 : quantity;
        else
            this.quantity = unit.convertToBase(quantity);
        this.unitType = unit.unitType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quantity quantity1 = (Quantity) o;
        return Double.compare(quantity1.quantity, quantity) == 0;
    }
}
