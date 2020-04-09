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

    @Test
    public void givenObjectTypeSame_ShouldReturnTrue() {
        Feet feet1 = new Feet(0);
        Feet feet2 = new Feet(0);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean areEqual = quantityMeasurement.compare(feet1, feet2);
        Assert.assertEquals(true, areEqual);
    }

    @Test
    public void givenObjectValueSame_ShouldReturnTrue() {
        Feet feet1 = new Feet(12);
        Feet feet2 = new Feet(12);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean areEqual = quantityMeasurement.compare(feet1, feet2);
        Assert.assertEquals(true, areEqual);
    }

    @Test
    public void givenObjectValueDifferent_ShouldReturnFalse() {
        Feet feet1 = new Feet(11);
        Feet feet2 = new Feet(12);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean areEqual = quantityMeasurement.compare(feet1, feet2);
        Assert.assertNotEquals(true, areEqual);
    }

    @Test
    public void givenLengthsInInch_ShouldReturnTrue() {
        Inch inch1 = new Inch(0);
        Inch inch2 = new Inch(0);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean areEqual = quantityMeasurement.compare(inch1, inch2);
        Assert.assertEquals(true, areEqual);
    }

    @Test
    public void givenInchObjectNull_ShouldReturnFalse() {
        Inch inch1 = new Inch(0);
        Inch inch2 = null;
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean areEqual = quantityMeasurement.compare(inch1, inch2);
        Assert.assertEquals(false, areEqual);
    }

    @Test
    public void givenInchObjectsSame_ShouldReturnTrue() {
        Inch inch1 = new Inch(0);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean areEqual = quantityMeasurement.compare(inch1, inch1);
        Assert.assertEquals(true, areEqual);
    }

    @Test
    public void givenInchObjectTypeSame_ShouldReturnTrue() {
        Inch inch1 = new Inch(0);
        Inch inch2 = new Inch(0);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean areEqual = quantityMeasurement.compare(inch1, inch2);
        Assert.assertEquals(true, areEqual);
    }

    @Test
    public void givenInchObjectValueSame_ShouldReturnTrue() {
        Inch inch1 = new Inch(12);
        Inch inch2 = new Inch(12);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean areEqual = quantityMeasurement.compare(inch1, inch2);
        Assert.assertEquals(true, areEqual);
    }

    @Test
    public void givenInchObjectValueDifferent_ShouldReturnTrue() {
        Inch inch1 = new Inch(12);
        Inch inch2 = new Inch(11);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean areEqual = quantityMeasurement.compare(inch1, inch2);
        Assert.assertNotEquals(true, areEqual);
    }
}