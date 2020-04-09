package com.bridgelabz.quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {
    @Test
    public void givenLengthsInFeet_ShouldReturnTrue() {
        Length length1 = new Length(0, QuantityMeasurement.LengthUnits.FEET);
        Length length2 = new Length(0, QuantityMeasurement.LengthUnits.FEET);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean areEqual = quantityMeasurement.compare(length1, length2);
        Assert.assertEquals(true, areEqual);
    }

    @Test
    public void givenObjectNull_ShouldReturnFalse() {
        Length length1 = new Length(0, QuantityMeasurement.LengthUnits.FEET);
        Length length2 = null;
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean areEqual = quantityMeasurement.compare(length1, length2);
        Assert.assertEquals(false, areEqual);
    }

    @Test
    public void givenObjectsSame_ShouldReturnTrue() {
        Length length1 = new Length(0, QuantityMeasurement.LengthUnits.FEET);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean areEqual = quantityMeasurement.compare(length1, length1);
        Assert.assertEquals(true, areEqual);
    }

    @Test
    public void givenObjectTypeSame_ShouldReturnTrue() {
        Length length1 = new Length(0, QuantityMeasurement.LengthUnits.FEET);
        Length length2 = new Length(0, QuantityMeasurement.LengthUnits.FEET);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean areEqual = quantityMeasurement.compare(length1, length2);
        Assert.assertEquals(true, areEqual);
    }

    @Test
    public void givenObjectValueSame_ShouldReturnTrue() {
        Length length1 = new Length(0, QuantityMeasurement.LengthUnits.FEET);
        Length length2 = new Length(0, QuantityMeasurement.LengthUnits.FEET);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean areEqual = quantityMeasurement.compare(length1, length2);
        Assert.assertEquals(true, areEqual);
    }

    @Test
    public void givenObjectValueDifferent_ShouldReturnFalse() {
        Length length1 = new Length(11, QuantityMeasurement.LengthUnits.FEET);
        Length length2 = new Length(12, QuantityMeasurement.LengthUnits.FEET);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean areEqual = quantityMeasurement.compare(length1, length2);
        Assert.assertNotEquals(true, areEqual);
    }

    @Test
    public void givenLengthsInInch_ShouldReturnTrue() {
        Length length1 = new Length(0, QuantityMeasurement.LengthUnits.INCH);
        Length length2 = new Length(0, QuantityMeasurement.LengthUnits.INCH);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean areEqual = quantityMeasurement.compare(length1, length2);
        Assert.assertEquals(true, areEqual);
    }

    @Test
    public void givenInchObjectNull_ShouldReturnFalse() {
        Length length1 = new Length(0, QuantityMeasurement.LengthUnits.INCH);
        Length length2 = null;
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean areEqual = quantityMeasurement.compare(length1, length2);
        Assert.assertEquals(false, areEqual);
    }

    @Test
    public void givenInchObjectsSame_ShouldReturnTrue() {
        Length length1 = new Length(0, QuantityMeasurement.LengthUnits.INCH);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean areEqual = quantityMeasurement.compare(length1, length1);
        Assert.assertEquals(true, areEqual);
    }

    @Test
    public void givenInchObjectTypeSame_ShouldReturnTrue() {
        Length length1 = new Length(0, QuantityMeasurement.LengthUnits.INCH);
        Length length2 = new Length(0, QuantityMeasurement.LengthUnits.INCH);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean areEqual = quantityMeasurement.compare(length1, length2);
        Assert.assertEquals(true, areEqual);
    }

    @Test
    public void givenInchObjectValueSame_ShouldReturnTrue() {
        Length length1 = new Length(0, QuantityMeasurement.LengthUnits.INCH);
        Length length2 = new Length(0, QuantityMeasurement.LengthUnits.INCH);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean areEqual = quantityMeasurement.compare(length1, length2);
        Assert.assertEquals(true, areEqual);
    }

    @Test
    public void givenInchObjectValueDifferent_ShouldReturnTrue() {
        Length length1 = new Length(12, QuantityMeasurement.LengthUnits.INCH);
        Length length2 = new Length(11, QuantityMeasurement.LengthUnits.INCH);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean areEqual = quantityMeasurement.compare(length1, length2);
        Assert.assertNotEquals(true, areEqual);
    }

    @Test
    public void givenInchAndFeetValue_ShouldReturnTrue() {
        Length length1 = new Length(0, QuantityMeasurement.LengthUnits.INCH);
        Length length2 = new Length(0, QuantityMeasurement.LengthUnits.FEET);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean areEqual = quantityMeasurement.compare(length1, length2);
        Assert.assertEquals(true, areEqual);
    }

    @Test
    public void givenTwoLengthsTest1_ShouldReturnFalse() {
        Length length2 = new Length(1, QuantityMeasurement.LengthUnits.FEET);
        Length length1 = new Length(1, QuantityMeasurement.LengthUnits.INCH);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean areEqual = quantityMeasurement.compare(length1, length2);
        Assert.assertEquals(false, areEqual);
    }


    @Test
    public void givenTwoLengthsTest2_ShouldReturnFalse() {
        Length length1 = new Length(1, QuantityMeasurement.LengthUnits.INCH);
        Length length2 = new Length(1, QuantityMeasurement.LengthUnits.FEET);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean areEqual = quantityMeasurement.compare(length1, length2);
        Assert.assertEquals(false, areEqual);
    }

    @Test
    public void givenTwoLengthsTest3_ShouldReturnTrue() {
        Length length1 = new Length(1, QuantityMeasurement.LengthUnits.FEET);
        Length length2 = new Length(12, QuantityMeasurement.LengthUnits.INCH);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean areEqual = quantityMeasurement.compare(length1, length2);
        Assert.assertEquals(true, areEqual);
    }

    @Test
    public void givenTwoLengthsTest4_ShouldReturnTrue() {
        Length length1 = new Length(12, QuantityMeasurement.LengthUnits.INCH);
        Length length2 = new Length(1, QuantityMeasurement.LengthUnits.FEET);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean areEqual = quantityMeasurement.compare(length1, length2);
        Assert.assertEquals(true, areEqual);
    }

    @Test
    public void givenTwoLengthsTest5_ShouldReturnTrue() {
        Length length1 = new Length(1, QuantityMeasurement.LengthUnits.FEET);
        Length length2 = new Length(1, QuantityMeasurement.LengthUnits.FEET);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean areEqual = quantityMeasurement.compare(length1, length2);
        Assert.assertEquals(true, areEqual);
    }

    @Test
    public void givenTwoLengthsTest6_ShouldReturnTrue() {
        Length length1 = new Length(    1, QuantityMeasurement.LengthUnits.INCH);
        Length length2 = new Length(1, QuantityMeasurement.LengthUnits.INCH);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean areEqual = quantityMeasurement.compare(length1, length2);
        Assert.assertEquals(true, areEqual);
    }

    @Test
    public void givenTwoLengthsTest1_WhenEqual_ShouldReturnTrue() {
        Length length1 = new Length(    3, QuantityMeasurement.LengthUnits.FEET);
        Length length2 = new Length(1, QuantityMeasurement.LengthUnits.YARD);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean areEqual = quantityMeasurement.compare(length1, length2);
        Assert.assertEquals(true, areEqual);
    }

    @Test
    public void givenTwoLengthsTest2_WhenEqual_ShouldReturnFalse() {
        Length length1 = new Length(    1, QuantityMeasurement.LengthUnits.FEET);
        Length length2 = new Length(1, QuantityMeasurement.LengthUnits.YARD);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean areEqual = quantityMeasurement.compare(length1, length2);
        Assert.assertEquals(false, areEqual);
    }

    @Test
    public void givenTwoLengthsTest3_WhenEqual_ShouldReturnFalse() {
        Length length1 = new Length(    1, QuantityMeasurement.LengthUnits.INCH);
        Length length2 = new Length(1, QuantityMeasurement.LengthUnits.YARD);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean areEqual = quantityMeasurement.compare(length1, length2);
        Assert.assertEquals(false, areEqual);
    }

    @Test
    public void givenTwoLengthsTest4_WhenEqual_ShouldReturnTrue() {
        Length length1 = new Length(    1, QuantityMeasurement.LengthUnits.YARD);
        Length length2 = new Length(36, QuantityMeasurement.LengthUnits.INCH);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean areEqual = quantityMeasurement.compare(length1, length2);
        Assert.assertEquals(true, areEqual);
    }

    @Test
    public void givenTwoLengthsTest4_WhenEqual_ShouldNotReturnFalse() {
        Length length1 = new Length(    1, QuantityMeasurement.LengthUnits.YARD);
        Length length2 = new Length(36, QuantityMeasurement.LengthUnits.INCH);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean areEqual = quantityMeasurement.compare(length1, length2);
        Assert.assertNotEquals(false, areEqual);
    }

    @Test
    public void givenTwoLengthsTest5_WhenEqual_ShouldReturnTrue() {
        Length length1 = new Length(    36, QuantityMeasurement.LengthUnits.INCH);
        Length length2 = new Length(1, QuantityMeasurement.LengthUnits.YARD);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean areEqual = quantityMeasurement.compare(length1, length2);
        Assert.assertEquals(true, areEqual);
    }
}
