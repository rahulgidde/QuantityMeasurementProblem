package adapter;

public class InchConversion extends QuantityAdapter {
    double value = 12.0;

    @Override
    public double compare(double feet) {
        return value * feet;
    }
}
