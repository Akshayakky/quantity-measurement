package com.bridgelabz.quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {
    @Test
    public void givenLengthsInFeet_ShouldReturnTrue() {
        Feet feet1 = new Feet(12);
        Feet feet2 = new Feet(12);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean areEqual = quantityMeasurement.compare(feet1, feet2);
        Assert.assertEquals(true, areEqual);
    }
}