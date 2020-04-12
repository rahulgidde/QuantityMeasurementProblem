package adapter;

public class CelsiusToFahrenheit extends QuantityAdapter {
    double value = 9.0 / 5.0;

    @Override
    public double compare(double celsius) {
        return (celsius - 32) * value;
    }
}
