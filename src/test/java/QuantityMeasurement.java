import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurement {

    @Test
    public void givenZeroFeetAndZeroFeet_WhenEqual_ShouldReturnTrue() {
        service.QuantityMeasurement measurement = new service.QuantityMeasurement(service.QuantityMeasurement.Conversion.FEET_TO_INCH);
        double firstConversion = measurement.getConversion(0.0);
        service.QuantityMeasurement measurement1 = new service.QuantityMeasurement(service.QuantityMeasurement.Conversion.FEET_TO_INCH);
        double secondConversion = measurement1.getConversion(0.0);
        Assert.assertEquals(firstConversion, secondConversion, 0.0);
    }

    @Test
    public void givenZeroFeetAndZeroFeet_WhenNullCheck_ShouldReturnResult() {
        service.QuantityMeasurement measurement = new service.QuantityMeasurement(service.QuantityMeasurement.Conversion.FEET_TO_INCH);
        double firstConversion = measurement.getConversion(0.0);
        boolean result = measurement.equals(null);
        Assert.assertEquals(false, result);
    }
}
