import adapter.QuantityAdapter;
import org.junit.Assert;
import org.junit.Test;
import service.QuantityMeasurement;

public class QuantityMeasurementTest {
    boolean result;

    @Test
    public void givenZeroFeetAndZeroFeet_WhenEqual_ShouldReturnTrue() {
        QuantityMeasurement measurement = new QuantityMeasurement(QuantityMeasurement.Conversion.FEET_TO_INCH);
        double firstConversion = measurement.getConversion(0.0);
        QuantityMeasurement measurement1 = new QuantityMeasurement(QuantityMeasurement.Conversion.FEET_TO_INCH);
        double secondConversion = measurement1.getConversion(0.0);
        Assert.assertEquals(firstConversion, secondConversion, 0.0);
    }

    @Test
    public void givenZeroFeetAndZeroFeet_WhenNullCheck_ShouldReturnResult() {
        QuantityMeasurement measurement = new QuantityMeasurement(QuantityMeasurement.Conversion.FEET_TO_INCH);
        double firstConversion = measurement.getConversion(0.0);
        result = measurement.equals(null);
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenZeroFeetAndZeroFeet_WhenCheckReference_ShouldReturnResult() {
        QuantityMeasurement measurement = new QuantityMeasurement(QuantityMeasurement.Conversion.FEET_TO_INCH);
        result = measurement.equals(measurement);
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenConversionType_WhenCheckType_ShouldReturnResult() {
        QuantityMeasurement measurement = new QuantityMeasurement(QuantityMeasurement.Conversion.FEET_TO_INCH);
        QuantityMeasurement measurement1 = new QuantityMeasurement(QuantityMeasurement.Conversion.FEET_TO_INCH);
        result = measurement.equals(measurement1);
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenFeet_WhenNotEqual_ShouldReturnFalse() {
        QuantityMeasurement measurement = new QuantityMeasurement(QuantityMeasurement.Conversion.FEET_TO_INCH);
        double firstConversion = measurement.getConversion(0.0);
        QuantityMeasurement measurement1 = new QuantityMeasurement(QuantityMeasurement.Conversion.FEET_TO_INCH);
        double secondConversion = measurement1.getConversion(1.0);
        Assert.assertNotEquals(firstConversion, secondConversion, 0.0);
    }

    @Test
    public void givenZeroInchAndZeroInch_WhenEqual_ShouldReturnTrue() {
        QuantityMeasurement measurement = new QuantityMeasurement(QuantityMeasurement.Conversion.INCH_TO_FEET);
        double firstConversion = measurement.getConversion(0.0);
        QuantityMeasurement measurement1 = new QuantityMeasurement(QuantityMeasurement.Conversion.INCH_TO_FEET);
        double secondConversion = measurement1.getConversion(0.0);
        Assert.assertEquals(firstConversion, secondConversion, 0.0);
    }

    @Test
    public void givenZeroInchAndZeroInch_WhenCheckNull_ShouldReturnResult() {
        QuantityMeasurement measurement = new QuantityMeasurement(QuantityMeasurement.Conversion.INCH_TO_FEET);
        double firstConversion = measurement.getConversion(0.0);
        result = measurement.equals(null);
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenZeroInch_WhenCheckReference_ShouldReturnResult() {
        QuantityMeasurement measurement = new QuantityMeasurement(QuantityMeasurement.Conversion.INCH_TO_FEET);
        result = measurement.equals(measurement);
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenConversionTypes_WhenCheckType_ShouldReturnResult() {
        QuantityMeasurement measurement = new QuantityMeasurement(QuantityMeasurement.Conversion.INCH_TO_FEET);
        QuantityMeasurement measurement1 = new QuantityMeasurement(QuantityMeasurement.Conversion.INCH_TO_FEET);
        result = measurement.equals(measurement1);
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenInch_WhenNotEqual_ShouldReturnFalse() {
        QuantityMeasurement measurement = new QuantityMeasurement(QuantityMeasurement.Conversion.INCH_TO_FEET);
        double firstConversion = measurement.getConversion(0.0);
        QuantityMeasurement measurement1 = new QuantityMeasurement(QuantityMeasurement.Conversion.INCH_TO_FEET);
        double secondConversion = measurement1.getConversion(1.0);
        Assert.assertNotEquals(firstConversion, secondConversion, 0.0);
    }

    @Test
    public void givenFeet_WhenCheckConversionEqualToYard_ShouldReturnTrue() {
        double feet = 3.0, yard = 1.0;
        QuantityMeasurement quantityMeasurementFeet = new QuantityMeasurement(QuantityMeasurement.Conversion.FEET_TO_YARD);
        double result = quantityMeasurementFeet.getConversion(feet);
        Assert.assertEquals(yard, result, 0.0);
    }

    @Test
    public void givenFeet_WhenCheckConversionNotEqualToYard_ShouldReturnTrue() {
        double feet = 3.0, yard = 1.0;
        QuantityMeasurement quantityMeasurementFeet = new QuantityMeasurement(QuantityMeasurement.Conversion.FEET_TO_YARD);
        double result = quantityMeasurementFeet.getConversion(feet);
        Assert.assertEquals(yard, result, 0.0);
    }

    @Test
    public void given1Inch_WhenCheckConversionNotEqualTo1Yard_ShouldReturnTrue() {
        double inch = 1.0, yard = 1.0;
        QuantityMeasurement quantityMeasurementFeet = new QuantityMeasurement(QuantityMeasurement.Conversion.INCH_TO_YARD);
        double result = quantityMeasurementFeet.getConversion(inch);
        Assert.assertNotEquals(yard, result, 0.0);
    }

    @Test
    public void givenYard_WhenCheckConversionEqualToInch_ShouldReturnTrue() {
        double inch = 36.0, yard = 1.0;
        QuantityMeasurement quantityMeasurementFeet = new QuantityMeasurement(QuantityMeasurement.Conversion.YARD_TO_INCH);
        double result = quantityMeasurementFeet.getConversion(yard);
        Assert.assertEquals(inch, result, 0.0);
    }

    @Test
    public void givenInch_WhenCheckConversionEqualToYard_ShouldReturnTrue() {
        double inch = 36.0, yard = 1.0;
        QuantityMeasurement quantityMeasurementFeet = new QuantityMeasurement(QuantityMeasurement.Conversion.INCH_TO_YARD);
        double result = quantityMeasurementFeet.getConversion(inch);
        Assert.assertEquals(yard, result, 0.0);
    }

    @Test
    public void givenYard_WhenCheckConversionEqualToFeet_ShouldReturnTrue() {
        double feet = 3.0, yard = 1.0;
        QuantityMeasurement quantityMeasurementFeet = new QuantityMeasurement(QuantityMeasurement.Conversion.YARD_TO_FEET);
        double result = quantityMeasurementFeet.getConversion(yard);
        Assert.assertEquals(feet, result, 0.0);
    }

    @Test
    public void givenInch_WhenCheckConversionEqualToCentimeter_ShouldReturnTrue() {
        double inch = 2.0, centimeter = 5.08;
        QuantityMeasurement quantityMeasurementFeet = new QuantityMeasurement(QuantityMeasurement.Conversion.INCH_TO_CM);
        double result = quantityMeasurementFeet.getConversion(inch);
        Assert.assertEquals(centimeter, result, 0.0);
    }

    @Test
    public void given1Inch_WhenCheckConversionNotEqualToCentimeter_ShouldReturnTrue() {
        double inch = 1.0, centimeter = 1.0;
        QuantityMeasurement quantityMeasurementFeet = new QuantityMeasurement(QuantityMeasurement.Conversion.INCH_TO_CM);
        double result = quantityMeasurementFeet.getConversion(inch);
        Assert.assertNotEquals(centimeter, result, 0.0);
    }

    @Test
    public void givenCentimeter_WhenCheckConversionEqualToInch_ShouldReturnTrue() {
        double inch = 2.0, centimeter = 5.09;
        QuantityMeasurement quantityMeasurementFeet = new QuantityMeasurement(QuantityMeasurement.Conversion.CM_TO_INCH);
        double result = quantityMeasurementFeet.getConversion(centimeter);
        Assert.assertEquals((int) inch, (int) result, 0.0);
    }

    @Test
    public void givenInch_WhenCheckAddition_ShouldReturnTrue() {
        double firstInch = 2.0, secondInch = 2.0, expected = 4.0;
        QuantityMeasurement quantityMeasurementFeet = new QuantityMeasurement(QuantityMeasurement.Conversion.INCH);
        double firstConversion = quantityMeasurementFeet.getConversion(firstInch);
        double secondConversion = quantityMeasurementFeet.getConversion(secondInch);
        double result = firstConversion + secondConversion;
        Assert.assertEquals(expected, result, 0.0);
    }
}
