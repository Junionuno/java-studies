package util;

public class FuelCalculator {
    public static double TotalCost(double distance, double consu, double price){
        double liter = distance/consu;
        return liter * price;
    }
}
