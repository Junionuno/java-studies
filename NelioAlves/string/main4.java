package NelioAlves.string;
import java.util.Scanner;

public class main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o raio: ");
        double radius = sc.nextDouble();
        double area = circleArea(radius);

        System.out.printf("Área do círculo = %.2f", area);

        sc.close();
    }

    public static double circleArea(double radius){
        double area = 3.14159 * (Math.pow(radius, 2));
        return area;
    }
}
