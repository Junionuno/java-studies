package POO;
import entities.Circle;
import java.util.Locale;
import java.util.Scanner;

public class exercicioGPT {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Circle circle = new Circle();

        System.out.print("Enter radius: ");
        circle.radius = sc.nextDouble();

        System.out.printf("AREA = %.2f%n", circle.area());
        System.out.printf("CIRCUMFERENCE = %.2f", circle.circumference());

        sc.close();
    }
}
