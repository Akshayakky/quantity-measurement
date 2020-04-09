package com.bridgelabz.quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {
    @Test
    public void givenLengthsInFeet_ShouldReturnTrue() {
        Feet feet1 = new Feet(0);
        Feet feet2 = new Feet(0);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean areEqual = quantityMeasurement.compare(feet1, feet2);
        Assert.assertEquals(true, areEqual);
    }

    @Test
    public void givenObjectNull_ShouldReturnFalse() {
        Feet feet1 = new Feet(0);
        Feet feet2 = null;
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean areEqual = quantityMeasurement.compare(feet1, feet2);
        Assert.assertEquals(false, areEqual);
    }

    @Test
    public void givenObjectsSame_ShouldReturnTrue() {
        Feet feet1 = new Feet(0);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean areEqual = quantityMeasurement.compare(feet1, feet1);
        Assert.assertEquals(true, areEqual);
    }
}