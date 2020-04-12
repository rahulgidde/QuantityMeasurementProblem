package adapter;

public class FahrenheitToCelsius extends QuantityAdapter {
    double value = 5.0 / 9.0;

    @Override
    public double compare(double fahrenheit) {
        return fahrenheit - 32 * value;
    }
}
