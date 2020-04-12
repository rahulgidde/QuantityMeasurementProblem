package adapter;

public class GallonToLitre extends QuantityAdapter {
    double value = 3.78;

    @Override
    public double compare(double gallon) {
        return gallon * value;
    }
}
