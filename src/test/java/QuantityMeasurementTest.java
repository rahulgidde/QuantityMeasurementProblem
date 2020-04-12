
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
    public void givenFeet_WhenCheckConversionEqualToYard_ShouldReturnTrue() {
        double feet = 3.0, yard = 1.0;
        QuantityMeasurement quantityMeasurementFeet = new QuantityMeasurement(QuantityMeasurement.Conversion.FEET_TO_YARD);
        double result = quantityMeasurementFeet.getConversion(feet);
        Assert.assertEquals(yard, result, 0.0);
    }

    @Test
    public void givenFeet_WhenCheckConversionNotEqualToYard_ShouldReturnTrue() {
        double feet = 3.0, yard = 1.0;
        QuantityMeasurement quantityMeasurementFeet = new QuantityMeasurement(QuantityMeasurement.Conversion.FEET_TO_YARD);
        double result = quantityMeasurementFeet.getConversion(feet);
        Assert.assertEquals(yard, result, 0.0);
    }

    @Test
    public void given1Inch_WhenCheckConversionNotEqualTo1Yard_ShouldReturnTrue() {
        double inch = 1.0, yard = 1.0;
        QuantityMeasurement quantityMeasurementFeet = new QuantityMeasurement(QuantityMeasurement.Conversion.INCH_TO_YARD);
        double result = quantityMeasurementFeet.getConversion(inch);
        Assert.assertNotEquals(yard, result, 0.0);
    }

    @Test
    public void givenYard_WhenCheckConversionEqualToInch_ShouldReturnTrue() {
        double inch = 36.0, yard = 1.0;
        QuantityMeasurement quantityMeasurementFeet = new QuantityMeasurement(QuantityMeasurement.Conversion.YARD_TO_INCH);
        double result = quantityMeasurementFeet.getConversion(yard);
        Assert.assertEquals(inch, result, 0.0);
    }

    @Test
    public void givenInch_WhenCheckConversionEqualToYard_ShouldReturnTrue() {
        double inch = 36.0, yard = 1.0;
        QuantityMeasurement quantityMeasurementFeet = new QuantityMeasurement(QuantityMeasurement.Conversion.INCH_TO_YARD);
        double result = quantityMeasurementFeet.getConversion(inch);
        Assert.assertEquals(yard, result, 0.0);
    }

    @Test
    public void givenYard_WhenCheckConversionEqualToFeet_ShouldReturnTrue() {
        double feet = 3.0, yard = 1.0;
        QuantityMeasurement quantityMeasurementFeet = new QuantityMeasurement(QuantityMeasurement.Conversion.YARD_TO_FEET);
        double result = quantityMeasurementFeet.getConversion(yard);
        Assert.assertEquals(feet, result, 0.0);
    }

    @Test
    public void givenInch_WhenCheckConversionEqualToCentimeter_ShouldReturnTrue() {
        double inch = 2.0, centimeter = 5.08;
        QuantityMeasurement quantityMeasurementFeet = new QuantityMeasurement(QuantityMeasurement.Conversion.INCH_TO_CM);
        double result = quantityMeasurementFeet.getConversion(inch);
        Assert.assertEquals(centimeter, result, 0.0);
    }

    @Test
    public void given1Inch_WhenCheckConversionNotEqualToCentimeter_ShouldReturnTrue() {
        double inch = 1.0, centimeter = 1.0;
        QuantityMeasurement quantityMeasurementFeet = new QuantityMeasurement(QuantityMeasurement.Conversion.INCH_TO_CM);
        double result = quantityMeasurementFeet.getConversion(inch);
        Assert.assertNotEquals(centimeter, result, 0.0);
    }

    @Test
    public void givenCentimeter_WhenCheckConversionEqualToInch_ShouldReturnTrue() {
        double inch = 2.0, centimeter = 5.09;
        QuantityMeasurement quantityMeasurementFeet = new QuantityMeasurement(QuantityMeasurement.Conversion.CM_TO_INCH);
        double result = quantityMeasurementFeet.getConversion(centimeter);
        Assert.assertEquals((int) inch, (int) result, 0.0);
    }

    @Test
    public void givenInch_WhenCheckAddition_ShouldReturnTrue() {
        double firstInch = 2.0, secondInch = 2.0, expected = 4.0;
        QuantityMeasurement quantityMeasurementFeet = new QuantityMeasurement(QuantityMeasurement.Conversion.INCH);
        double firstConversion = quantityMeasurementFeet.getConversion(firstInch);
        double secondConversion = quantityMeasurementFeet.getConversion(secondInch);
        double result = firstConversion + secondConversion;
        Assert.assertEquals(expected, result, 0.0);
    }

    @Test
    public void givenFeetAndInch_WhenCheckAddition_ShouldReturnTrue() {
        double feet = 1.0, inch = 2.0, expected = 14.0;
        QuantityMeasurement quantityMeasurementFeet = new QuantityMeasurement(QuantityMeasurement.Conversion.FEET_TO_INCH);
        double feetConversion = quantityMeasurementFeet.getConversion(feet);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(QuantityMeasurement.Conversion.INCH);
        double inchConversion = quantityMeasurement.getConversion(inch);
        double result = feetConversion + inchConversion;
        Assert.assertEquals(expected, result, 0.0);
    }

    @Test
    public void givenFeetAndFeet_WhenCheckAddition_ShouldReturnTrue() {
        double firstFeet = 1.0, secondFeet = 1.0, expected = 24.0;
        QuantityMeasurement quantityMeasurementFeet = new QuantityMeasurement(QuantityMeasurement.Conversion.FEET_TO_INCH);
        double firstConversion = quantityMeasurementFeet.getConversion(firstFeet);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(QuantityMeasurement.Conversion.FEET_TO_INCH);
        double secondConversion = quantityMeasurement.getConversion(secondFeet);
        double result = firstConversion + secondConversion;
        Assert.assertEquals(expected, result, 0.0);
    }

    @Test
    public void givenInchAndCentimeter_WhenCheckAddition_ShouldReturnTrue() {
        double inch = 2.3, centimeter = 2.5, expected = 3.0;
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(QuantityMeasurement.Conversion.INCH);
        double firstConversion = quantityMeasurement.getConversion(inch);
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(QuantityMeasurement.Conversion.CM_TO_INCH);
        double secondConversion = quantityMeasurement1.getConversion(centimeter);
        double result = firstConversion + secondConversion;
        Assert.assertEquals((int) expected, (int) result, 0.0);
    }

    @Test
    public void givenGallon_WhenCheckConversionEqualToLitre_ShouldReturnTrue() {
        double gallon = 1.0, litre = 3.78;
        QuantityMeasurement quantityMeasurementFeet = new QuantityMeasurement(QuantityMeasurement.Conversion.GALLON_TO_LITRES);
        double result = quantityMeasurementFeet.getConversion(gallon);
        Assert.assertEquals(litre, result, 0.0);
    }

    @Test
    public void givenLitre_WhenCheckConversionEqualToGallon_ShouldReturnTrue() {
        double gallon = 1.0, litre = 3.78;
        QuantityMeasurement quantityMeasurementFeet = new QuantityMeasurement(QuantityMeasurement.Conversion.LITRES_TO_GALLON);
        double result = quantityMeasurementFeet.getConversion(litre);
        Assert.assertEquals(gallon, result, 0.0);
    }

    @Test
    public void givenLitre_WhenCheckConversionEqualToMillilitre_ShouldReturnTrue() {
        double litre = 1.0, millilitre = 1000.0;
        QuantityMeasurement quantityMeasurementFeet = new QuantityMeasurement(QuantityMeasurement.Conversion.LITER_TO_MILLILITER);
        double result = quantityMeasurementFeet.getConversion(litre);
        Assert.assertEquals(millilitre, result, 0.0);
    }

    @Test
    public void givenMillilitre_WhenCheckConversionEqualToLitre_ShouldReturnTrue() {
        double litre = 1.0, millilitre = 1000.0;
        QuantityMeasurement quantityMeasurementFeet = new QuantityMeasurement(QuantityMeasurement.Conversion.MILLILITER_TO_LITER);
        double result = quantityMeasurementFeet.getConversion(millilitre);
        Assert.assertEquals(litre, result, 0.0);
    }

    @Test
    public void givenGallonAndLiters_WhenAdditionOfTwoVolumes_ShouldReturnResultInLiters() {
        double gallon = 1.0, liter = 3.78, expected = 7.56;
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(QuantityMeasurement.Conversion.GALLON_TO_LITRES);
        double litreConversion = quantityMeasurement.getConversion(gallon);
        double result = litreConversion + liter;
        Assert.assertEquals(expected, result, 0.0);
    }

    @Test
    public void givenMilliliterAndLiters_WhenAdditionOfTwoVolumes_ShouldReturnResultInLiters() {
        double millilitre = 1000.0, litre = 1.0, expected = 2.0;
        QuantityMeasurement quantityMeasurementLitre = new QuantityMeasurement(QuantityMeasurement.Conversion.MILLILITER_TO_LITER);
        double litreConversion = quantityMeasurementLitre.getConversion(millilitre);
        double result = litreConversion + litre;
        Assert.assertEquals(expected, result, 0.0);
    }

    @Test
    public void givenKg_WhenCheckComparisonToGrams_ShouldReturnResult() {
        double kilogram = 1.0, grams = 1000.0;
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(QuantityMeasurement.Conversion.KG_TO_GRAMS);
        double gramValue = quantityMeasurement.getConversion(kilogram);
        Assert.assertEquals(grams, gramValue, 0.0);
    }

    @Test
    public void givenTonne_WhenCheckComparisonToKilograms_ShouldReturnResult() {
        double kilogram = 1000.0, tonne = 1.0;
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(QuantityMeasurement.Conversion.TONNE_TO_KG);
        double kilogramConversion = quantityMeasurement.getConversion(tonne);
        Assert.assertEquals(kilogram, kilogramConversion, 0.0);
    }

    @Test
    public void givenGrams_WhenCheckComparisonToKilogram_ShouldReturnResult() {
        double kilogram = 1.0, grams = 1000.0;
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(QuantityMeasurement.Conversion.GRAM_TO_KG);
        double gramConversion = quantityMeasurement.getConversion(grams);
        Assert.assertEquals(kilogram, gramConversion, 0.0);
    }
}
