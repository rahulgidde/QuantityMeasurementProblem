package adapter;

public class FeetToYardConversion extends QuantityAdapter {
    double value=3.0;
    @Override
    public double compare(double feet) {
        return feet/value;
    }
}
