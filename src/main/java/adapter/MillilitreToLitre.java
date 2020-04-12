package adapter;

public class MillilitreToLitre extends QuantityAdapter {
    double value = 1000.0;

    @Override
    public double compare(double millilitre) {
        return millilitre / value;
    }
}
