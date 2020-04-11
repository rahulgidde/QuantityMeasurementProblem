package adapter;

import service.QuantityMeasurement;

public class QuantityFactory {
    public static QuantityAdapter getConversionType(QuantityMeasurement.Conversion type) {
        if (type.equals(QuantityMeasurement.Conversion.FEET_TO_INCH))
            return new InchConversion();
        return null;
    }
}
