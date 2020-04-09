package com.bridgelabz.quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {
    @Test
    public void givenLengthsInFeet_ShouldReturnTrue() {
        Quantity quantity1 = new Quantity(1, Unit.FEET);
        Quantity quantity2 = new Quantity(12, Unit.INCH);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean areEqual = quantityMeasurement.compare(quantity1, quantity2);
        Assert.assertEquals(true, areEqual);
    }

    @Test
    public void givenObjectNull_ShouldReturnFalse() {
        Quantity quantity1 = new Quantity(0, Unit.FEET);
        Quantity quantity2 = null;
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean areEqual = quantityMeasurement.compare(quantity1, quantity2);
        Assert.assertEquals(false, areEqual);
    }

    @Test
    public void givenObjectsSame_ShouldReturnTrue() {
        Quantity quantity1 = new Quantity(0, Unit.FEET);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean areEqual = quantityMeasurement.compare(quantity1, quantity1);
        Assert.assertEquals(true, areEqual);
    }

    @Test
    public void givenObjectTypeSame_ShouldReturnTrue() {
        Quantity quantity1 = new Quantity(0, Unit.FEET);
        Quantity quantity2 = new Quantity(0, Unit.FEET);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean areEqual = quantityMeasurement.compare(quantity1, quantity2);
        Assert.assertEquals(true, areEqual);
    }

    @Test
    public void givenObjectValueSame_ShouldReturnTrue() {
        Quantity quantity1 = new Quantity(0, Unit.FEET);
        Quantity quantity2 = new Quantity(0, Unit.FEET);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean areEqual = quantityMeasurement.compare(quantity1, quantity2);
        Assert.assertEquals(true, areEqual);
    }

    @Test
    public void givenObjectValueDifferent_ShouldReturnFalse() {
        Quantity quantity1 = new Quantity(11, Unit.FEET);
        Quantity quantity2 = new Quantity(12, Unit.FEET);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean areEqual = quantityMeasurement.compare(quantity1, quantity2);
        Assert.assertNotEquals(true, areEqual);
    }

    @Test
    public void givenLengthsInInch_ShouldReturnTrue() {
        Quantity quantity1 = new Quantity(0, Unit.INCH);
        Quantity quantity2 = new Quantity(0, Unit.INCH);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean areEqual = quantityMeasurement.compare(quantity1, quantity2);
        Assert.assertEquals(true, areEqual);
    }

    @Test
    public void givenInchObjectNull_ShouldReturnFalse() {
        Quantity quantity1 = new Quantity(0, Unit.INCH);
        Quantity quantity2 = null;
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean areEqual = quantityMeasurement.compare(quantity1, quantity2);
        Assert.assertEquals(false, areEqual);
    }

    @Test
    public void givenInchObjectsSame_ShouldReturnTrue() {
        Quantity quantity1 = new Quantity(0, Unit.INCH);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean areEqual = quantityMeasurement.compare(quantity1, quantity1);
        Assert.assertEquals(true, areEqual);
    }

    @Test
    public void givenInchObjectTypeSame_ShouldReturnTrue() {
        Quantity quantity1 = new Quantity(0, Unit.INCH);
        Quantity quantity2 = new Quantity(0, Unit.INCH);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean areEqual = quantityMeasurement.compare(quantity1, quantity2);
        Assert.assertEquals(true, areEqual);
    }

    @Test
    public void givenInchObjectValueSame_ShouldReturnTrue() {
        Quantity quantity1 = new Quantity(0, Unit.INCH);
        Quantity quantity2 = new Quantity(0, Unit.INCH);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean areEqual = quantityMeasurement.compare(quantity1, quantity2);
        Assert.assertEquals(true, areEqual);
    }

    @Test
    public void givenInchObjectValueDifferent_ShouldReturnTrue() {
        Quantity quantity1 = new Quantity(12, Unit.INCH);
        Quantity quantity2 = new Quantity(11, Unit.INCH);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean areEqual = quantityMeasurement.compare(quantity1, quantity2);
        Assert.assertNotEquals(true, areEqual);
    }

    @Test
    public void givenInchAndFeetValue_ShouldReturnTrue() {
        Quantity quantity1 = new Quantity(0, Unit.INCH);
        Quantity quantity2 = new Quantity(0, Unit.FEET);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean areEqual = quantityMeasurement.compare(quantity1, quantity2);
        Assert.assertEquals(true, areEqual);
    }

    @Test
    public void givenTwoLengthsTest1_ShouldReturnFalse() {
        Quantity quantity2 = new Quantity(1, Unit.FEET);
        Quantity quantity1 = new Quantity(1, Unit.INCH);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean areEqual = quantityMeasurement.compare(quantity1, quantity2);
        Assert.assertEquals(false, areEqual);
    }


    @Test
    public void givenTwoLengthsTest2_ShouldReturnFalse() {
        Quantity quantity1 = new Quantity(1, Unit.INCH);
        Quantity quantity2 = new Quantity(1, Unit.FEET);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean areEqual = quantityMeasurement.compare(quantity1, quantity2);
        Assert.assertEquals(false, areEqual);
    }

    @Test
    public void givenTwoLengthsTest3_ShouldReturnTrue() {
        Quantity quantity1 = new Quantity(1, Unit.FEET);
        Quantity quantity2 = new Quantity(12, Unit.INCH);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean areEqual = quantityMeasurement.compare(quantity1, quantity2);
        Assert.assertEquals(true, areEqual);
    }

    @Test
    public void givenTwoLengthsTest4_ShouldReturnTrue() {
        Quantity quantity1 = new Quantity(12, Unit.INCH);
        Quantity quantity2 = new Quantity(1, Unit.FEET);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean areEqual = quantityMeasurement.compare(quantity1, quantity2);
        Assert.assertEquals(true, areEqual);
    }

    @Test
    public void givenTwoLengthsTest5_ShouldReturnTrue() {
        Quantity quantity1 = new Quantity(1, Unit.FEET);
        Quantity quantity2 = new Quantity(1, Unit.FEET);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean areEqual = quantityMeasurement.compare(quantity1, quantity2);
        Assert.assertEquals(true, areEqual);
    }

    @Test
    public void givenTwoLengthsTest6_ShouldReturnTrue() {
        Quantity quantity1 = new Quantity(1, Unit.INCH);
        Quantity quantity2 = new Quantity(1, Unit.INCH);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean areEqual = quantityMeasurement.compare(quantity1, quantity2);
        Assert.assertEquals(true, areEqual);
    }

    @Test
    public void givenTwoLengthsTest1_WhenEqual_ShouldReturnTrue() {
        Quantity quantity1 = new Quantity(3, Unit.FEET);
        Quantity quantity2 = new Quantity(1, Unit.YARD);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean areEqual = quantityMeasurement.compare(quantity1, quantity2);
        Assert.assertEquals(true, areEqual);
    }

    @Test
    public void givenTwoLengthsTest2_WhenEqual_ShouldReturnFalse() {
        Quantity quantity1 = new Quantity(1, Unit.FEET);
        Quantity quantity2 = new Quantity(1, Unit.YARD);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean areEqual = quantityMeasurement.compare(quantity1, quantity2);
        Assert.assertEquals(false, areEqual);
    }

    @Test
    public void givenTwoLengthsTest3_WhenEqual_ShouldReturnFalse() {
        Quantity quantity1 = new Quantity(1, Unit.INCH);
        Quantity quantity2 = new Quantity(1, Unit.YARD);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean areEqual = quantityMeasurement.compare(quantity1, quantity2);
        Assert.assertEquals(false, areEqual);
    }

    @Test
    public void givenTwoLengthsTest4_WhenEqual_ShouldReturnTrue() {
        Quantity quantity1 = new Quantity(1, Unit.YARD);
        Quantity quantity2 = new Quantity(36, Unit.INCH);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean areEqual = quantityMeasurement.compare(quantity1, quantity2);
        Assert.assertEquals(true, areEqual);
    }

    @Test
    public void givenTwoLengthsTest4_WhenEqual_ShouldNotReturnFalse() {
        Quantity quantity1 = new Quantity(1, Unit.YARD);
        Quantity quantity2 = new Quantity(36, Unit.INCH);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean areEqual = quantityMeasurement.compare(quantity1, quantity2);
        Assert.assertNotEquals(false, areEqual);
    }

    @Test
    public void givenTwoLengthsTest5_WhenEqual_ShouldReturnTrue() {
        Quantity quantity1 = new Quantity(36, Unit.INCH);
        Quantity quantity2 = new Quantity(1, Unit.YARD);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean areEqual = quantityMeasurement.compare(quantity1, quantity2);
        Assert.assertEquals(true, areEqual);
    }

    @Test
    public void givenTwoLengthsTest6_WhenEqual_ShouldReturnTrue() {
        Quantity quantity1 = new Quantity(1, Unit.YARD);
        Quantity quantity2 = new Quantity(3, Unit.FEET);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean areEqual = quantityMeasurement.compare(quantity1, quantity2);
        Assert.assertEquals(true, areEqual);
    }

    @Test
    public void givenTwoLengths_WhenEqual_ShouldReturnTrue() {
        Quantity quantity1 = new Quantity(2.5, Unit.CENTIMETER);
        Quantity quantity2 = new Quantity(1, Unit.INCH);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean areEqual = quantityMeasurement.compare(quantity1, quantity2);
        Assert.assertEquals(true, areEqual);
    }

    @Test
    public void givenTwoLengthsOneInCentimeter_WhenEqual_ShouldReturnTrue() {
        Quantity quantity1 = new Quantity(5, Unit.CENTIMETER);
        Quantity quantity2 = new Quantity(2, Unit.INCH);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean areEqual = quantityMeasurement.compare(quantity1, quantity2);
        Assert.assertEquals(true, areEqual);
    }

    @Test
    public void givenTwoLengthsTest1_ShouldReturnSumInInches() {
        Quantity quantity1 = new Quantity(2, Unit.INCH);
        Quantity quantity2 = new Quantity(2, Unit.INCH);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        double sum = quantityMeasurement.add(quantity1, quantity2);
        Assert.assertEquals(4, sum, 0);
    }

    @Test
    public void givenTwoLengthsTest2_ShouldReturnSumInInches() {
        Quantity quantity1 = new Quantity(1, Unit.FEET);
        Quantity quantity2 = new Quantity(2, Unit.INCH);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        double sum = quantityMeasurement.add(quantity1, quantity2);
        Assert.assertEquals(14, sum, 0);
    }

    @Test
    public void givenTwoLengthsTest3_ShouldReturnSumInInches() {
        Quantity quantity1 = new Quantity(1, Unit.FEET);
        Quantity quantity2 = new Quantity(1, Unit.FEET);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        double sum = quantityMeasurement.add(quantity1, quantity2);
        Assert.assertEquals(24, sum, 0);
    }

    @Test
    public void givenTwoLengthsTest4_ShouldReturnSumInInches() {
        Quantity quantity1 = new Quantity(2, Unit.INCH);
        Quantity quantity2 = new Quantity(2.5, Unit.CENTIMETER);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        double sum = quantityMeasurement.add(quantity1, quantity2);
        Assert.assertEquals(3, sum, 0);
    }
}
