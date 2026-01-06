package NelioAlves.util;

public class ImportCalculator {

    public static double total(double price, double tax, double fee){
        double t = price * tax / 100;
        double f = price * fee / 100;
        return price + t + f;
    }
}
