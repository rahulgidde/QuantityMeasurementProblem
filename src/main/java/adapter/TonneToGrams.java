package adapter;

public class TonneToGrams extends QuantityAdapter {
    double value = 1000.0;

    @Override
    public double compare(double tonne) {
        return tonne * value;
    }
}
