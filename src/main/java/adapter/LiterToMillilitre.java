package adapter;

public class LiterToMillilitre extends QuantityAdapter {
    double value = 1000.0;

    @Override
    public double compare(double litre) {
        return litre * value;
    }
}
