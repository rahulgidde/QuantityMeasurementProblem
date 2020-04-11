import org.junit.Assert;
import org.junit.Test;
import service.QuantityMeasurement;

public class QuantityMeasurementTest {

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
        boolean result = measurement.equals(null);
        Assert.assertEquals(false, result);
    }
}
