package service;

import adapter.QuantityAdapter;
import adapter.QuantityFactory;

public class QuantityMeasurement {
    Conversion type;

    //ENUM FOR CONVERSION
    public enum Conversion {
        FEET_TO_INCH, INCH_TO_FEET, FEET_TO_YARD, INCH_TO_YARD, YARD_TO_INCH, YARD_TO_FEET, INCH_TO_CM, CM_TO_INCH,
        INCH, GALLON_TO_LITRES, LITRES_TO_GALLON, LITER_TO_MILLILITER, MILLILITER_TO_LITER, KG_TO_GRAMS, TONNE_TO_KG;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMeasurement that = (QuantityMeasurement) o;
        return type == that.type;
    }
}
