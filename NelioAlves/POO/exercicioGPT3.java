package NelioAlves.POO;

import NelioAlves.entities.Temperature;

import java.util.Locale;
import java.util.Scanner;

public class exercicioGPT3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Temperature temperature = new Temperature();

        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = sc.nextDouble();

        double resultK = temperature.toKelvin(celsius);
        double resultF = temperature.toFahrenheit(celsius);

        System.out.printf("Temperatura em Kelvin: %.2f%n", resultK);
        System.out.printf("Temperatura em Fahrenheit: %.2f", resultF);

        sc.close();

    }
}
