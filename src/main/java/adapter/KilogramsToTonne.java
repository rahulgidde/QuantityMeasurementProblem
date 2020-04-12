package adapter;

public class KilogramsToTonne extends QuantityAdapter {
    double value = 1000.0;

    @Override
    public double compare(double kilogram) {
        return kilogram / value;
    }
}
