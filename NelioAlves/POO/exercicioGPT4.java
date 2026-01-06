package NelioAlves.POO;

import NelioAlves.util.rectangle;

import java.util.Locale;
import java.util.Scanner;

public class exercicioGPT4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        rectangle rec = new rectangle();

        System.out.println("Digite a altura e largura do retângulo: ");
        rec.height = sc.nextDouble();
        rec.width = sc.nextDouble();

        System.out.printf("AREA = %.2f %n", rec.area());
        System.out.printf("PERIMETER = %.2f %n", rec.perimeter());


        System.out.println("Digite novos valores de altura e largura: ");
        double newHeight = sc.nextDouble();
        double newWidth = sc.nextDouble();

        rec.updateDimensions(newHeight, newWidth);

        System.out.printf("AREA = %.2f%n", rec.area());
        System.out.printf("PERIMETER = %.2f", rec.perimeter());

        sc.close();
    }
}
