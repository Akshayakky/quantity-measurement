package com.bridgelabz.quantitymeasurement;

public class QuantityMeasurementException extends Throwable {
    enum ExceptionType {
        ATTRIBUTE_MISMATCH, NULL_QUANTITY;
    }

    ExceptionType type;

    public QuantityMeasurementException(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }
}
