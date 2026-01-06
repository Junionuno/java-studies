package NelioAlves.util;

public class CurrencyConverter {
    public static final double IOF = 0.06;

    public static double dollarToReal(double bought, double dollar){
        double conv = dollar * bought;
        return conv * IOF + conv;
    }
}
