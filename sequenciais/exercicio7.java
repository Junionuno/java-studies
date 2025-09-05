package sequenciais;
import java.util.Locale;
import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		double a, b, c;
		System.out.println("Digite os valores do triangulo: ");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		double triangulo = (a * c) / 2;
		System.out.printf("TRIANGULO: %.3f %n", triangulo);
		
		double circulo = Math.pow(c, 2) * 3.14159;
		System.out.printf("CIRCULO: %.3f %n", circulo);
		
		double trapezio = ((a + b) * c) / 2;
		System.out.printf("TRAPEZIO: %.3f %n", trapezio);
		
		double quadrado = b * b;
		System.out.printf("QUADRADO: %.3f %n", quadrado);
		
		double retangulo = a * b;
		System.out.printf("RETANGULO: %.3f %n", retangulo);
		
		sc.close();
	}

}
