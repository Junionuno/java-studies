package sequenciais;
import java.util.Locale;
import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		double raio;
		System.out.print("Digite o raio do círculo: ");
		raio = sc.nextDouble();
		
		double area = 3.14159 * Math.pow(raio, 2);
		
		System.out.printf("A = %.4f", area);
		
		sc.close();
	}

}
