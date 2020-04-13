package adapter;

import service.QuantityMeasurement;

public class QuantityFactory {
    public static QuantityAdapter getConversionType(QuantityMeasurement.Conversion type) {
        switch (type) {
            case FEET_TO_INCH:
                return new InchConversion();
            case INCH_TO_FEET:
                return new FeetConversion();
            case FEET_TO_YARD:
                return new FeetToYardConversion();
            case INCH_TO_YARD:
                return new InchToYardConversion();
            case YARD_TO_INCH:
                return new YardToInchConversion();
            case YARD_TO_FEET:
                return new YardToFeetConversion();
            case INCH_TO_CM:
                return new InchToCentimeter();
            case CM_TO_INCH:
                return new CentimeterToInch();
            case INCH:
                return new InchAddition();
            case GALLON_TO_LITRES:
                return new GallonToLitre();
            case LITRES_TO_GALLON:
                return new LitreToGallon();
            case LITER_TO_MILLILITER:
                return new LiterToMillilitre();
            case MILLILITER_TO_LITER:
                return new MillilitreToLitre();
            case KG_TO_GRAMS:
                return new KilogramsToGrams();
            case TONNE_TO_KG:
                return new TonneToGrams();
            case GRAM_TO_KG:
                return new GramsToKilograms();
            case KG_TO_TONNE:
                return new KilogramsToTonne();
            case FAHRENHEIT_TO_CELSIUS:
                return new FahrenheitToCelsius();
            case CELSIUS_TO_FAHRENHEIT:
                return new CelsiusToFahrenheit();
            default:
                return null;
        }
    }
}
