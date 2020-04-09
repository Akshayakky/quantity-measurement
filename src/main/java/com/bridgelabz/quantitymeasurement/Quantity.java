package com.bridgelabz.quantitymeasurement;

public class Quantity {
    public double quantity;
    public Unit.Entity entity;

    public Quantity(double quantity, Unit unit) {
        this.quantity = unit.convertToBase(quantity);
        this.entity = unit.entity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quantity quantity1 = (Quantity) o;
        return Double.compare(quantity1.quantity, quantity) == 0 &&
                entity == quantity1.entity;
    }
}
