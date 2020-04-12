package adapter;

import service.QuantityMeasurement;

public class QuantityFactory {
    public static QuantityAdapter getConversionType(QuantityMeasurement.Conversion type) {
        if (type.equals(QuantityMeasurement.Conversion.FEET_TO_INCH))
            return new InchConversion();
        if (type.equals(QuantityMeasurement.Conversion.INCH_TO_FEET))
            return new FeetConversion();
        if (type.equals(QuantityMeasurement.Conversion.FEET_TO_YARD))
            return new FeetToYardConversion();
        if (type.equals(QuantityMeasurement.Conversion.INCH_TO_YARD))
            return new InchToYardConversion();
        if (type.equals(QuantityMeasurement.Conversion.YARD_TO_INCH))
            return new YardToInchConversion();
        if (type.equals(QuantityMeasurement.Conversion.YARD_TO_FEET))
            return new YardToFeetConversion();
        if (type.equals(QuantityMeasurement.Conversion.INCH_TO_CM))
            return new InchToCentimeter();
        if (type.equals(QuantityMeasurement.Conversion.CM_TO_INCH))
            return new CentimeterToInch();
        if (type.equals(QuantityMeasurement.Conversion.INCH))
            return new InchAddition();
        if (type.equals(QuantityMeasurement.Conversion.GALLON_TO_LITRES))
            return new GallonToLitre();
        if (type.equals(QuantityMeasurement.Conversion.LITRES_TO_GALLON))
            return new LitreToGallon();
        if (type.equals(QuantityMeasurement.Conversion.LITER_TO_MILLILITER))
            return new LiterToMillilitre();
        if (type.equals(QuantityMeasurement.Conversion.MILLILITER_TO_LITER))
            return new MillilitreToLitre();
        if (type.equals(QuantityMeasurement.Conversion.KG_TO_GRAMS))
            return new KilogramsToGrams();
        if (type.equals(QuantityMeasurement.Conversion.TONNE_TO_KG))
            return new TonneToGrams();
        if (type.equals(QuantityMeasurement.Conversion.GRAM_TO_KG))
            return new GramsToKilograms();
        return null;
    }
}
