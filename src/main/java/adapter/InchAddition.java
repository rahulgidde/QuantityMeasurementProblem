package adapter;

public class InchAddition extends QuantityAdapter {
    double value = 1.0;

    @Override
    public double compare(double inch) {
        return inch * value;
    }
}
