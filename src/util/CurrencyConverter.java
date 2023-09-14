package util;

public class CurrencyConverter {
    public static final double IOF = 0.06;
    public static double amount(double priceDolar, double amount){
        double value = priceDolar * amount;
        return value + (value * IOF);
    }
}
