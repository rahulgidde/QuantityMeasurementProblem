package adapter;

public class YardToFeetConverstion extends QuantityAdapter {
    double value=3.0;
    @Override
    public double compare(double yard) {
        return yard*value;
    }
}
