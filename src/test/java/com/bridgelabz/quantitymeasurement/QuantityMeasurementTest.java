package com.bridgelabz.quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {
    @Test
    public void givenLengthsInFeet_ShouldReturnTrue() {
        try {
            Quantity quantity1 = new Quantity(1, Unit.FEET);
            Quantity quantity2 = new Quantity(12, Unit.INCH);
            QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
            boolean areEqual = quantityMeasurement.compare(quantity1, quantity2);
            Assert.assertEquals(true, areEqual);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenObjectNull_ShouldThrowException() {
        try {
            Quantity quantity1 = new Quantity(0, Unit.FEET);
            QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
            boolean areEqual = quantityMeasurement.compare(quantity1, null);
            Assert.assertEquals(false, areEqual);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NULL_QUANTITY, e.type);
        }
    }

    @Test
    public void givenObjectsSame_ShouldReturnTrue() {
        try {
            Quantity quantity1 = new Quantity(0, Unit.FEET);
            QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
            boolean areEqual = quantityMeasurement.compare(quantity1, quantity1);
            Assert.assertEquals(true, areEqual);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenObjectTypeSame_ShouldReturnTrue() {
        try {
            Quantity quantity1 = new Quantity(0, Unit.FEET);
            Quantity quantity2 = new Quantity(0, Unit.FEET);
            QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
            boolean areEqual = quantityMeasurement.compare(quantity1, quantity2);
            Assert.assertEquals(true, areEqual);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenObjectValueSame_ShouldReturnTrue() {
        try {
            Quantity quantity1 = new Quantity(0, Unit.FEET);
            Quantity quantity2 = new Quantity(0, Unit.FEET);
            QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
            boolean areEqual = quantityMeasurement.compare(quantity1, quantity2);
            Assert.assertEquals(true, areEqual);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenObjectValueDifferent_ShouldReturnFalse() {
        try {
            Quantity quantity1 = new Quantity(11, Unit.FEET);
            Quantity quantity2 = new Quantity(12, Unit.FEET);
            QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
            boolean areEqual = quantityMeasurement.compare(quantity1, quantity2);
            Assert.assertNotEquals(true, areEqual);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenLengthsInInch_ShouldReturnTrue() {
        try {
            Quantity quantity1 = new Quantity(0, Unit.INCH);
            Quantity quantity2 = new Quantity(0, Unit.INCH);
            QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
            boolean areEqual = quantityMeasurement.compare(quantity1, quantity2);
            Assert.assertEquals(true, areEqual);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenInchObjectNull_ShouldThrowException() {
        try {
            Quantity quantity1 = new Quantity(0, Unit.INCH);
            QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
            boolean areEqual = quantityMeasurement.compare(quantity1, null);
            Assert.assertEquals(false, areEqual);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NULL_QUANTITY, e.type);
        }
    }

    @Test
    public void givenInchObjectsSame_ShouldReturnTrue() {
        try {
            Quantity quantity1 = new Quantity(0, Unit.INCH);
            QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
            boolean areEqual = quantityMeasurement.compare(quantity1, quantity1);
            Assert.assertEquals(true, areEqual);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenInchObjectTypeSame_ShouldReturnTrue() {
        try {
            Quantity quantity1 = new Quantity(0, Unit.INCH);
            Quantity quantity2 = new Quantity(0, Unit.INCH);
            QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
            boolean areEqual = quantityMeasurement.compare(quantity1, quantity2);
            Assert.assertEquals(true, areEqual);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenInchObjectValueSame_ShouldReturnTrue() {
        try {
            Quantity quantity1 = new Quantity(0, Unit.INCH);
            Quantity quantity2 = new Quantity(0, Unit.INCH);
            QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
            boolean areEqual = quantityMeasurement.compare(quantity1, quantity2);
            Assert.assertEquals(true, areEqual);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenInchObjectValueDifferent_ShouldReturnTrue() {
        try {
            Quantity quantity1 = new Quantity(12, Unit.INCH);
            Quantity quantity2 = new Quantity(11, Unit.INCH);
            QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
            boolean areEqual = quantityMeasurement.compare(quantity1, quantity2);
            Assert.assertNotEquals(true, areEqual);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenInchAndFeetValue_ShouldReturnTrue() {
        try {
            Quantity quantity1 = new Quantity(0, Unit.INCH);
            Quantity quantity2 = new Quantity(0, Unit.FEET);
            QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
            boolean areEqual = quantityMeasurement.compare(quantity1, quantity2);
            Assert.assertEquals(true, areEqual);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenTwoLengthsTest1_ShouldReturnFalse() {
        try {
            Quantity quantity2 = new Quantity(1, Unit.FEET);
            Quantity quantity1 = new Quantity(1, Unit.INCH);
            QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
            boolean areEqual = quantityMeasurement.compare(quantity1, quantity2);
            Assert.assertEquals(false, areEqual);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void givenTwoLengthsTest2_ShouldReturnFalse() {
        try {
            Quantity quantity1 = new Quantity(1, Unit.INCH);
            Quantity quantity2 = new Quantity(1, Unit.FEET);
            QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
            boolean areEqual = quantityMeasurement.compare(quantity1, quantity2);
            Assert.assertEquals(false, areEqual);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenTwoLengthsTest3_ShouldReturnTrue() {
        try {
            Quantity quantity1 = new Quantity(1, Unit.FEET);
            Quantity quantity2 = new Quantity(12, Unit.INCH);
            QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
            boolean areEqual = quantityMeasurement.compare(quantity1, quantity2);
            Assert.assertEquals(true, areEqual);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenTwoLengthsTest4_ShouldReturnTrue() {
        try {
            Quantity quantity1 = new Quantity(12, Unit.INCH);
            Quantity quantity2 = new Quantity(1, Unit.FEET);
            QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
            boolean areEqual = quantityMeasurement.compare(quantity1, quantity2);
            Assert.assertEquals(true, areEqual);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenTwoLengthsTest5_ShouldReturnTrue() {
        try {
            Quantity quantity1 = new Quantity(1, Unit.FEET);
            Quantity quantity2 = new Quantity(1, Unit.FEET);
            QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
            boolean areEqual = quantityMeasurement.compare(quantity1, quantity2);
            Assert.assertEquals(true, areEqual);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenTwoLengthsTest6_ShouldReturnTrue() {
        try {
            Quantity quantity1 = new Quantity(1, Unit.INCH);
            Quantity quantity2 = new Quantity(1, Unit.INCH);
            QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
            boolean areEqual = quantityMeasurement.compare(quantity1, quantity2);
            Assert.assertEquals(true, areEqual);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenTwoLengthsTest1_WhenEqual_ShouldReturnTrue() {
        try {
            Quantity quantity1 = new Quantity(3, Unit.FEET);
            Quantity quantity2 = new Quantity(1, Unit.YARD);
            QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
            boolean areEqual = quantityMeasurement.compare(quantity1, quantity2);
            Assert.assertEquals(true, areEqual);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenTwoLengthsTest2_WhenEqual_ShouldReturnFalse() {
        try {
            Quantity quantity1 = new Quantity(1, Unit.FEET);
            Quantity quantity2 = new Quantity(1, Unit.YARD);
            QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
            boolean areEqual = quantityMeasurement.compare(quantity1, quantity2);
            Assert.assertEquals(false, areEqual);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenTwoLengthsTest3_WhenEqual_ShouldReturnFalse() {
        try {
            Quantity quantity1 = new Quantity(1, Unit.INCH);
            Quantity quantity2 = new Quantity(1, Unit.YARD);
            QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
            boolean areEqual = quantityMeasurement.compare(quantity1, quantity2);
            Assert.assertEquals(false, areEqual);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenTwoLengthsTest4_WhenEqual_ShouldReturnTrue() {
        try {
            Quantity quantity1 = new Quantity(1, Unit.YARD);
            Quantity quantity2 = new Quantity(36, Unit.INCH);
            QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
            boolean areEqual = quantityMeasurement.compare(quantity1, quantity2);
            Assert.assertEquals(true, areEqual);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenTwoLengthsTest4_WhenEqual_ShouldNotReturnFalse() {
        try {
            Quantity quantity1 = new Quantity(1, Unit.YARD);
            Quantity quantity2 = new Quantity(36, Unit.INCH);
            QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
            boolean areEqual = quantityMeasurement.compare(quantity1, quantity2);
            Assert.assertNotEquals(false, areEqual);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenTwoLengthsTest5_WhenEqual_ShouldReturnTrue() {
        try {
            Quantity quantity1 = new Quantity(36, Unit.INCH);
            Quantity quantity2 = new Quantity(1, Unit.YARD);
            QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
            boolean areEqual = quantityMeasurement.compare(quantity1, quantity2);
            Assert.assertEquals(true, areEqual);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenTwoLengthsTest6_WhenEqual_ShouldReturnTrue() {
        try {
            Quantity quantity1 = new Quantity(1, Unit.YARD);
            Quantity quantity2 = new Quantity(3, Unit.FEET);
            QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
            boolean areEqual = quantityMeasurement.compare(quantity1, quantity2);
            Assert.assertEquals(true, areEqual);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenTwoLengths_WhenEqual_ShouldReturnTrue() {
        try {
            Quantity quantity1 = new Quantity(2.5, Unit.CENTIMETER);
            Quantity quantity2 = new Quantity(1, Unit.INCH);
            QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
            boolean areEqual = quantityMeasurement.compare(quantity1, quantity2);
            Assert.assertEquals(true, areEqual);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenTwoLengthsOneInCentimeter_WhenEqual_ShouldReturnTrue() {
        try {
            Quantity quantity1 = new Quantity(5, Unit.CENTIMETER);
            Quantity quantity2 = new Quantity(2, Unit.INCH);
            QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
            boolean areEqual = quantityMeasurement.compare(quantity1, quantity2);
            Assert.assertEquals(true, areEqual);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenTwoLengthsTest1_ShouldReturnSumInInches() {
        try {
            Quantity quantity1 = new Quantity(2, Unit.INCH);
            Quantity quantity2 = new Quantity(2, Unit.INCH);
            QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
            double sum = quantityMeasurement.add(quantity1, quantity2);
            Assert.assertEquals(4, sum, 0);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenTwoLengthsTest2_ShouldReturnSumInInches() {
        try {
            Quantity quantity1 = new Quantity(1, Unit.FEET);
            Quantity quantity2 = new Quantity(2, Unit.INCH);
            QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
            double sum = quantityMeasurement.add(quantity1, quantity2);
            Assert.assertEquals(14, sum, 0);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenTwoLengthsTest3_ShouldReturnSumInInches() {
        try {
            Quantity quantity1 = new Quantity(1, Unit.FEET);
            Quantity quantity2 = new Quantity(1, Unit.FEET);
            QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
            double sum = quantityMeasurement.add(quantity1, quantity2);
            Assert.assertEquals(24, sum, 0);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenTwoLengthsTest4_ShouldReturnSumInInches() {
        try {
            Quantity quantity1 = new Quantity(2, Unit.INCH);
            Quantity quantity2 = new Quantity(2.5, Unit.CENTIMETER);
            QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
            double sum = quantityMeasurement.add(quantity1, quantity2);
            Assert.assertEquals(3, sum, 0);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenTwoVolumes_WhenEqual_ShouldReturnTrue() {
        try {
            Quantity quantity1 = new Quantity(0, Unit.LITRE);
            Quantity quantity2 = new Quantity(0, Unit.FEET);
            QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
            boolean areEqual = quantityMeasurement.compare(quantity1, quantity2);
            Assert.assertEquals(true, areEqual);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.ATTRIBUTE_MISMATCH, e.type);
        }
    }

    @Test
    public void givenTwoVolumes_ShouldReturnSumInLitre() {
        try {
            Quantity quantity1 = new Quantity(1, Unit.GALLON);
            Quantity quantity2 = new Quantity(3.78, Unit.LITRE);
            QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
            double sum = quantityMeasurement.add(quantity1, quantity2);
            Assert.assertEquals(7.57, sum, 0.1);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenTwoVolumesTest2_ShouldReturnSumInLitre() {
        try {
            Quantity quantity1 = new Quantity(1, Unit.LITRE);
            Quantity quantity2 = new Quantity(1000, Unit.MILLILITRE);
            QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
            double sum = quantityMeasurement.add(quantity1, quantity2);
            Assert.assertEquals(2, sum, 0.1);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenTwoWeights_WhenEqual_ShouldReturnTrue() {
        try {
            Quantity quantity1 = new Quantity(1, Unit.KILOGRAMS);
            Quantity quantity2 = new Quantity(1000, Unit.GRAMS);
            QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
            boolean areEqual = quantityMeasurement.compare(quantity1, quantity2);
            Assert.assertEquals(true, areEqual);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenTwoWeightsTest2_WhenEqual_ShouldReturnTrue() {
        try {
            Quantity quantity1 = new Quantity(1, Unit.TONNE);
            Quantity quantity2 = new Quantity(1000, Unit.KILOGRAMS);
            QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
            boolean areEqual = quantityMeasurement.compare(quantity1, quantity2);
            Assert.assertEquals(true, areEqual);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenTwoWeights_ShouldReturnSumInKG() {
        try {
            Quantity quantity1 = new Quantity(1, Unit.TONNE);
            Quantity quantity2 = new Quantity(1000, Unit.GRAMS);
            QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
            double sum = quantityMeasurement.add(quantity1, quantity2);
            Assert.assertEquals(1001, sum, 0.1);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenTwoTemperature_WhenEqual_ShouldReturnTrue() {
        try {
            Quantity quantity1 = new Quantity(212, Unit.FAHRENHEIT);
            Quantity quantity2 = new Quantity(100, Unit.CELCIUS);
            QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
            boolean areEqual = quantityMeasurement.compare(quantity1, quantity2);
            Assert.assertEquals(true, areEqual);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenTwoTemperatureTest2_WhenEqual_ShouldReturnTrue() {
        try {
            Quantity quantity1 = new Quantity(413.6, Unit.FAHRENHEIT);
            Quantity quantity2 = new Quantity(212, Unit.CELCIUS);
            QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
            boolean areEqual = quantityMeasurement.compare(quantity1, quantity2);
            Assert.assertEquals(true, areEqual);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenTwoTemperature_WhenNull_ShouldThrowException() {
        try {
            Quantity quantity1 = new Quantity(212, Unit.FAHRENHEIT);
            QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
            boolean areEqual = quantityMeasurement.compare(quantity1, null);
            Assert.assertEquals(true, areEqual);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NULL_QUANTITY, e.type);
        }
    }

    @Test
    public void givenTwoDifferentAttributes_ShouldThrowException() {
        try {
            Quantity quantity1 = new Quantity(212, Unit.FAHRENHEIT);
            Quantity quantity2 = new Quantity(100, Unit.KILOGRAMS);
            QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
            boolean areEqual = quantityMeasurement.compare(quantity1, quantity2);
            Assert.assertEquals(true, areEqual);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.ATTRIBUTE_MISMATCH, e.type);
        }
    }

    @Test
    public void givenTwoTemperatureToAdd_WhenNull_ShouldThrowException() {
        try {
            Quantity quantity1 = new Quantity(212, Unit.FAHRENHEIT);
            Quantity quantity2 = null;
            QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
            double sum = quantityMeasurement.add(quantity1, quantity2);
            Assert.assertEquals(212, sum, 0);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NULL_QUANTITY, e.type);
        }
    }

    @Test
    public void givenTwoDifferentAttributesToAdd_ShouldThrowException() {
        try {
            Quantity quantity1 = new Quantity(212, Unit.FAHRENHEIT);
            Quantity quantity2 = new Quantity(100, Unit.KILOGRAMS);
            QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
            double sum = quantityMeasurement.add(quantity1, quantity2);
            Assert.assertEquals(312, sum, 0);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.ATTRIBUTE_MISMATCH, e.type);
        }
    }

    @Test
    public void givenTwoTemperaturesToAdd_ShouldThrowException() {
        try {
            Quantity quantity1 = new Quantity(212, Unit.FAHRENHEIT);
            Quantity quantity2 = new Quantity(100, Unit.CELCIUS);
            QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
            double sum = quantityMeasurement.add(quantity1, quantity2);
            Assert.assertEquals(200, sum, 0);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NOT_POSSIBLE, e.type);
        }
    }
}
