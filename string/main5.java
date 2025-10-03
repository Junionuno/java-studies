package string;

import java.util.Scanner;

public class main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a base: ");
        double base = sc.nextDouble();
        System.out.print("Digite a altura: ");
        double altura = sc.nextDouble();

        double area = area(base, altura);
        double perimetro = perimetro(base, altura);
        double diagonal = diagonal(base, altura);

        System.out.printf("Área = %.2f %nPerímetro = %.2f %nDiagonal = %.2f", area, perimetro, diagonal);

        sc.close();
    }

    public static double area(double base, double altura){
        double area = base * altura;
        return area;
    }

    public static double perimetro(double base, double altura){
        double perimetro = 2 * (base + altura);
        return perimetro;
    }

    public static double diagonal(double base, double altura){
        double diagonal = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
        return diagonal;
    }
}
