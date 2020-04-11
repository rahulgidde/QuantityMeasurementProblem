package adapter;

public class YardToInchConversion extends QuantityAdapter {
    double value = 36.0;

    @Override
    public double compare(double yard) {
        return yard * value;
    }
}
