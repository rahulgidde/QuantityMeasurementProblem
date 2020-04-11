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
        double firstConversion = measurement.getConversion(0.0);
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
        double secondConversion = measurement1.getConversion(0.1);
        Assert.assertNotEquals(firstConversion, secondConversion, 0.0);
    }
}
