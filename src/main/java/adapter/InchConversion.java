package adapter;

public class InchConversion extends QuantityAdapter {
    double inch = 12;

    @Override
    public double compare(double value) {
        return inch * value;
    }
}
