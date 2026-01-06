package NelioAlves.sequenciais;
import java.util.Scanner;

public class ExercicioGpt3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int nota1;
		int nota2;
		
		System.out.print("Digite a sua primeira nota: ");
		nota1 = sc.nextInt();
		System.out.print("Digite a sua segunda nota: ");
		nota2 = sc.nextInt();
		
		double media = (double) (nota1 + nota2) / 2;
		
		System.out.printf("A sua média é de: %.1f %n", media);
		sc.close();
	}

}
