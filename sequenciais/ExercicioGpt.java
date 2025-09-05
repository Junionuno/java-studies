package sequenciais;
import java.util.Scanner;

public class ExercicioGpt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double baseMaior, baseMenor, altura;
		double area;
		
		System.out.print("Digite a base maior: ");
		baseMaior = sc.nextDouble();
		System.out.print("Agora digite a base menor: ");
		baseMenor = sc.nextDouble();
		System.out.print("E por úlitmo a altura: ");
		altura = sc.nextDouble();
				
		area = (baseMaior + baseMenor) / 2 * altura;
		
		System.out.printf("A área do trapézio é: %.2f", area);
		
		
		sc.close();
	}

}
