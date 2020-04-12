package adapter;

public class GramsToKilograms extends QuantityAdapter {
    double value = 1000.0;

    @Override
    public double compare(double grams) {
        return grams / value;
    }
}
