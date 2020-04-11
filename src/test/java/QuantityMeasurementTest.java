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
    public void given3Feet_WhenCheckComparisonEqualTo1Yard_ShouldReturnTrue() {
        double feet = 3.0, yard = 1.0;
        QuantityMeasurement quantityMeasurementFeet = new QuantityMeasurement(QuantityMeasurement.Conversion.FEET_TO_YARD);
        double firstFeet = quantityMeasurementFeet.getConversion(feet);
        Assert.assertEquals(yard, firstFeet, 0.0);
    }
}
