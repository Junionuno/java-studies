package sequenciais;
import java.util.Scanner;

public class ExercicioGpt2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double x1, x2, y1, y2;
		
		x1 = sc.nextDouble();
		x2 = sc.nextDouble();
		y1 = sc.nextDouble();
		y2 = sc.nextDouble();
		
		double delta, distancia;
		delta = Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2);
		distancia = Math.sqrt(delta);
		
		System.out.printf("A distância entre os dois pontos é: %.4f", distancia);
		
		sc.close();
	}
}
