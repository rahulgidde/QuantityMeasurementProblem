package adapter;

public class CentimeterToInch extends QuantityAdapter {
    double value = 2.54;

    @Override
    public double compare(double centimeter) {
        return centimeter / value;
    }
}
