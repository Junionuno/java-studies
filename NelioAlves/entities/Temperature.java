package NelioAlves.entities;

public class Temperature {
    public double celsius;

    public double toFahrenheit(double celsius){
        return celsius * 1.8 + 32;
    }

    public double toKelvin(double celsius){
        return celsius + 273.15;
    }
}
