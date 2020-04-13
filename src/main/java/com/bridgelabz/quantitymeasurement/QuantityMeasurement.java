package com.bridgelabz.quantitymeasurement;

public class QuantityMeasurement {

    public boolean compare(Quantity quantity1, Quantity quantity2) throws QuantityMeasurementException {
        if (quantity1 == null || quantity2 == null)
            throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.NULL_QUANTITY, "Null Object");
        if (quantity1.unitType != quantity2.unitType)
            throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.ATTRIBUTE_MISMATCH, "Attribute Mismatch");
        return quantity1.equals(quantity2);
    }

    public double add(Quantity quantity1, Quantity quantity2) throws QuantityMeasurementException {
        if (quantity1 == null || quantity2 == null)
            throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.NULL_QUANTITY, "Null Object");
        if (quantity1.unitType != quantity2.unitType)
            throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.ATTRIBUTE_MISMATCH, "Attribute Mismatch");
        if (quantity1.unitType == UnitType.TEMPERATURE)
            throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.NOT_POSSIBLE, "Cannot Add Temperatures");
        return quantity1.quantity + quantity2.quantity;
    }
}