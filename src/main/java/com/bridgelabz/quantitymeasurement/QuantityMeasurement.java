package com.bridgelabz.quantitymeasurement;

public class QuantityMeasurement {

    public boolean compare(Quantity quantity1, Quantity quantity2) throws QuantityMeasurementException {
        if (quantity1 == null || quantity2 == null)
            throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.NULL_QUANTITY, "Null Object");
        if (quantity1.attribute != quantity2.attribute)
            throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.ATTRIBUTE_MISMATCH, "Attribute Mismatch");
        return quantity1.equals(quantity2);
    }

    public double add(Quantity quantity1, Quantity quantity2) throws QuantityMeasurementException {
        if (quantity1 == null || quantity2 == null)
            throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.NULL_QUANTITY, "Null Object");
        if (quantity1.attribute != quantity2.attribute)
            throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.ATTRIBUTE_MISMATCH, "Attribute Mismatch");
        return quantity1.quantity + quantity2.quantity;
    }
}