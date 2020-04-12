package adapter;

public class LitreToGallon extends QuantityAdapter {
    double value = 3.78;

    @Override
    public double compare(double litre) {
        return litre / value;
    }
}
