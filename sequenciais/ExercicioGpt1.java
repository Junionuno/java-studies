package sequenciais;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioGpt1 {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		String nome;
		int idade;
		double salario;
		
		System.out.print("Digite o seu nome: ");
		nome = sc.next();
		System.out.print("Digite a sua idade: ");
		idade = sc.nextInt();
		System.out.print("E agora o seu salário: ");
		salario = sc.nextDouble();
		
		System.out.printf("Nome: %s %n", nome);
		
		System.out.printf("Idade: %d anos %n", idade);
		
		System.out.printf("Salário: R$ %.2f %n", salario);
		sc.close();
	}
}
