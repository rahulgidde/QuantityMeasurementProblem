package adapter;

public class FeetConversion extends QuantityAdapter {
    double value = 12.0;

    @Override
    public double compare(double inch) {
        return inch / value;
    }
}
