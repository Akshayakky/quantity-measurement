package com.bridgelabz.quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {
    @Test
    public void givenLengthsInFeet_ShouldReturnTrue() {
        Length length1 = new Length(1, Unit.FEET);
        Length length2 = new Length(12, Unit.INCH);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean areEqual = quantityMeasurement.compare(length1, length2);
        Assert.assertEquals(true, areEqual);
    }

    @Test
    public void givenObjectNull_ShouldReturnFalse() {
        Length length1 = new Length(0, Unit.FEET);
        Length length2 = null;
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean areEqual = quantityMeasurement.compare(length1, length2);
        Assert.assertEquals(false, areEqual);
    }

    @Test
    public void givenObjectsSame_ShouldReturnTrue() {
        Length length1 = new Length(0, Unit.FEET);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean areEqual = quantityMeasurement.compare(length1, length1);
        Assert.assertEquals(true, areEqual);
    }

    @Test
    public void givenObjectTypeSame_ShouldReturnTrue() {
        Length length1 = new Length(0, Unit.FEET);
        Length length2 = new Length(0, Unit.FEET);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean areEqual = quantityMeasurement.compare(length1, length2);
        Assert.assertEquals(true, areEqual);
    }

    @Test
    public void givenObjectValueSame_ShouldReturnTrue() {
        Length length1 = new Length(0, Unit.FEET);
        Length length2 = new Length(0, Unit.FEET);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean areEqual = quantityMeasurement.compare(length1, length2);
        Assert.assertEquals(true, areEqual);
    }

    @Test
    public void givenObjectValueDifferent_ShouldReturnFalse() {
        Length length1 = new Length(11, Unit.FEET);
        Length length2 = new Length(12, Unit.FEET);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean areEqual = quantityMeasurement.compare(length1, length2);
        Assert.assertNotEquals(true, areEqual);
    }

    @Test
    public void givenLengthsInInch_ShouldReturnTrue() {
        Length length1 = new Length(0, Unit.INCH);
        Length length2 = new Length(0, Unit.INCH);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean areEqual = quantityMeasurement.compare(length1, length2);
        Assert.assertEquals(true, areEqual);
    }

    @Test
    public void givenInchObjectNull_ShouldReturnFalse() {
        Length length1 = new Length(0, Unit.INCH);
        Length length2 = null;
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean areEqual = quantityMeasurement.compare(length1, length2);
        Assert.assertEquals(false, areEqual);
    }

    @Test
    public void givenInchObjectsSame_ShouldReturnTrue() {
        Length length1 = new Length(0, Unit.INCH);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean areEqual = quantityMeasurement.compare(length1, length1);
        Assert.assertEquals(true, areEqual);
    }

    @Test
    public void givenInchObjectTypeSame_ShouldReturnTrue() {
        Length length1 = new Length(0, Unit.INCH);
        Length length2 = new Length(0, Unit.INCH);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean areEqual = quantityMeasurement.compare(length1, length2);
        Assert.assertEquals(true, areEqual);
    }

    @Test
    public void givenInchObjectValueSame_ShouldReturnTrue() {
        Length length1 = new Length(0, Unit.INCH);
        Length length2 = new Length(0, Unit.INCH);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean areEqual = quantityMeasurement.compare(length1, length2);
        Assert.assertEquals(true, areEqual);
    }

    @Test
    public void givenInchObjectValueDifferent_ShouldReturnTrue() {
        Length length1 = new Length(12, Unit.INCH);
        Length length2 = new Length(11, Unit.INCH);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean areEqual = quantityMeasurement.compare(length1, length2);
        Assert.assertNotEquals(true, areEqual);
    }

    @Test
    public void givenInchAndFeetValue_ShouldReturnTrue() {
        Length length1 = new Length(0, Unit.INCH);
        Length length2 = new Length(0, Unit.FEET);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean areEqual = quantityMeasurement.compare(length1, length2);
        Assert.assertEquals(true, areEqual);
    }

    @Test
    public void givenTwoLengthsTest1_ShouldReturnFalse() {
        Length length2 = new Length(1, Unit.FEET);
        Length length1 = new Length(1, Unit.INCH);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean areEqual = quantityMeasurement.compare(length1, length2);
        Assert.assertEquals(false, areEqual);
    }


    @Test
    public void givenTwoLengthsTest2_ShouldReturnFalse() {
        Length length1 = new Length(1, Unit.INCH);
        Length length2 = new Length(1, Unit.FEET);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean areEqual = quantityMeasurement.compare(length1, length2);
        Assert.assertEquals(false, areEqual);
    }

    @Test
    public void givenTwoLengthsTest3_ShouldReturnTrue() {
        Length length1 = new Length(1, Unit.FEET);
        Length length2 = new Length(12, Unit.INCH);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean areEqual = quantityMeasurement.compare(length1, length2);
        Assert.assertEquals(true, areEqual);
    }

    @Test
    public void givenTwoLengthsTest4_ShouldReturnTrue() {
        Length length1 = new Length(12, Unit.INCH);
        Length length2 = new Length(1, Unit.FEET);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean areEqual = quantityMeasurement.compare(length1, length2);
        Assert.assertEquals(true, areEqual);
    }

    @Test
    public void givenTwoLengthsTest5_ShouldReturnTrue() {
        Length length1 = new Length(1, Unit.FEET);
        Length length2 = new Length(1, Unit.FEET);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean areEqual = quantityMeasurement.compare(length1, length2);
        Assert.assertEquals(true, areEqual);
    }

    @Test
    public void givenTwoLengthsTest6_ShouldReturnTrue() {
        Length length1 = new Length(1, Unit.INCH);
        Length length2 = new Length(1, Unit.INCH);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean areEqual = quantityMeasurement.compare(length1, length2);
        Assert.assertEquals(true, areEqual);
    }

    @Test
    public void givenTwoLengthsTest1_WhenEqual_ShouldReturnTrue() {
        Length length1 = new Length(3, Unit.FEET);
        Length length2 = new Length(1, Unit.YARD);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean areEqual = quantityMeasurement.compare(length1, length2);
        Assert.assertEquals(true, areEqual);
    }

    @Test
    public void givenTwoLengthsTest2_WhenEqual_ShouldReturnFalse() {
        Length length1 = new Length(1, Unit.FEET);
        Length length2 = new Length(1, Unit.YARD);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean areEqual = quantityMeasurement.compare(length1, length2);
        Assert.assertEquals(false, areEqual);
    }

    @Test
    public void givenTwoLengthsTest3_WhenEqual_ShouldReturnFalse() {
        Length length1 = new Length(1, Unit.INCH);
        Length length2 = new Length(1, Unit.YARD);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean areEqual = quantityMeasurement.compare(length1, length2);
        Assert.assertEquals(false, areEqual);
    }

    @Test
    public void givenTwoLengthsTest4_WhenEqual_ShouldReturnTrue() {
        Length length1 = new Length(1, Unit.YARD);
        Length length2 = new Length(36, Unit.INCH);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean areEqual = quantityMeasurement.compare(length1, length2);
        Assert.assertEquals(true, areEqual);
    }

    @Test
    public void givenTwoLengthsTest4_WhenEqual_ShouldNotReturnFalse() {
        Length length1 = new Length(1, Unit.YARD);
        Length length2 = new Length(36, Unit.INCH);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean areEqual = quantityMeasurement.compare(length1, length2);
        Assert.assertNotEquals(false, areEqual);
    }

    @Test
    public void givenTwoLengthsTest5_WhenEqual_ShouldReturnTrue() {
        Length length1 = new Length(36, Unit.INCH);
        Length length2 = new Length(1, Unit.YARD);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean areEqual = quantityMeasurement.compare(length1, length2);
        Assert.assertEquals(true, areEqual);
    }

    @Test
    public void givenTwoLengthsTest6_WhenEqual_ShouldReturnTrue() {
        Length length1 = new Length(1, Unit.YARD);
        Length length2 = new Length(3, Unit.FEET);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean areEqual = quantityMeasurement.compare(length1, length2);
        Assert.assertEquals(true, areEqual);
    }

    @Test
    public void givenTwoLengths_WhenEqual_ShouldReturnTrue() {
        Length length1 = new Length(2.5, Unit.CENTIMETER);
        Length length2 = new Length(1, Unit.INCH);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean areEqual = quantityMeasurement.compare(length1, length2);
        Assert.assertEquals(true, areEqual);
    }

    @Test
    public void givenTwoLengthsOneInCentimeter_WhenEqual_ShouldReturnTrue() {
        Length length1 = new Length(5, Unit.CENTIMETER);
        Length length2 = new Length(2, Unit.INCH);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean areEqual = quantityMeasurement.compare(length1, length2);
        Assert.assertEquals(true, areEqual);
    }

    @Test
    public void givenTwoLengthsTest1_ShouldReturnSumInInches() {
        Length length1 = new Length(2, Unit.INCH);
        Length length2 = new Length(2, Unit.INCH);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        double sum = quantityMeasurement.add(length1, length2);
        Assert.assertEquals(4, sum, 0);
    }

    @Test
    public void givenTwoLengthsTest2_ShouldReturnSumInInches() {
        Length length1 = new Length(1, Unit.FEET);
        Length length2 = new Length(2, Unit.INCH);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        double sum = quantityMeasurement.add(length1, length2);
        Assert.assertEquals(14, sum, 0);
    }

    @Test
    public void givenTwoLengthsTest3_ShouldReturnSumInInches() {
        Length length1 = new Length(1, Unit.FEET);
        Length length2 = new Length(1, Unit.FEET);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        double sum = quantityMeasurement.add(length1, length2);
        Assert.assertEquals(24, sum, 0);
    }

    @Test
    public void givenTwoLengthsTest4_ShouldReturnSumInInches() {
        Length length1 = new Length(2, Unit.INCH);
        Length length2 = new Length(2.5, Unit.CENTIMETER);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        double sum = quantityMeasurement.add(length1, length2);
        Assert.assertEquals(3, sum, 0);
    }
}
