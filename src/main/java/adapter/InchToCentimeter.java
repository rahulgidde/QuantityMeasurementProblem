package adapter;

public class InchToCentimeter extends QuantityAdapter {
    double value = 2.54;

    @Override
    public double compare(double inch) {
        return inch * value;
    }
}
