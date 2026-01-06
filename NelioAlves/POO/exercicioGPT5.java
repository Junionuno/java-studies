package NelioAlves.POO;

import NelioAlves.util.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class exercicioGPT5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle triangle = new Triangle();

        System.out.println("Digite os três lados do triângulo: ");
        triangle.a = sc.nextDouble();
        triangle.b = sc.nextDouble();
        triangle.c = sc.nextDouble();

        System.out.printf("PERIMETRO: %.2f%n", triangle.perimeter());
        System.out.printf("SEMIPERIMETRO: %.2f%n", triangle.semiPerimeter());
        System.out.printf("ÁREA: %.2f %n", triangle.area());

        System.out.println("Digite os novos lados: ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();

        triangle.updateSide(x, y, z);

        System.out.printf("PERIMETRO: %.2f%n", triangle.perimeter());
        System.out.printf("SEMIPERIMETRO: %.2f%n", triangle.semiPerimeter());
        System.out.printf("ÁREA: %.2f %n", triangle.area());

        sc.close();
    }
}
