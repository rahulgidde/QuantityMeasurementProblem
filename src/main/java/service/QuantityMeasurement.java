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
    public double getConversion(Double value) {
        QuantityAdapter adapter = QuantityFactory.getConversionType(type);
        double result = adapter.compare(value);
        return result;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null)
            return false;
        else if (object == this)
            return true;
        else if (object.getClass() == this.getClass())
            return true;
        else
            return super.equals(object);
    }
}
