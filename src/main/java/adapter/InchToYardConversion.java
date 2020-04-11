package adapter;

public class InchToYardConversion extends QuantityAdapter {
    double value = 36.0;

    @Override
    public double compare(double inch) {
        return inch / value;
    }
}
