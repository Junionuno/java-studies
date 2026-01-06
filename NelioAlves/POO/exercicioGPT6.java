package NelioAlves.POO;

import NelioAlves.entities.Cilindro;

import java.util.Locale;
import java.util.Scanner;

public class exercicioGPT6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Cilindro cil = new Cilindro();

        System.out.print("Digite o raio e a altura do cilindro: ");
        cil.raio = sc.nextDouble();
        cil.altura = sc.nextDouble();

        System.out.printf("VOLUME: %.2f%n", cil.volume());
        System.out.printf("AREA: %.2f%n", cil.area());

        System.out.print("Digite os novos valores, raio e altura: ");
        double r = sc.nextDouble();
        double a = sc.nextDouble();
        cil.updateValue(r, a);

        System.out.printf("VOLUME: %.2f%n", cil.volume());
        System.out.printf("AREA: %.2f%n", cil.area());

        sc.close();
    }
}
