package service;

import adapter.QuantityAdapter;
import adapter.QuantityFactory;

public class QuantityMeasurement {
    Conversion type;

    //ENUM FOR CONVERSION
    public enum Conversion {
        FEET_TO_INCH;
    }

    //PARAMETRIZED CONSTRUCTOR
    public QuantityMeasurement(Conversion type) {
        this.type = type;
    }

    //METHOD FOR CONVERSION
    public double getConversion(double value) {
        QuantityAdapter adapter = QuantityFactory.getConversionType(type);
        double result = adapter.compare(value);
        return result;
    }
}
