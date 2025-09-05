package sequenciais;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		
//		String nome;
//		System.out.print("Digite o seu nome: ");
//		nome = sc.next();
//		System.out.println("Seu nome é " + nome);
		
//		int idade;
//		System.out.print("Agora digite sua idade: ");
//		idade = sc.nextInt();
//		System.out.println("Sua idade é: " + idade);
		
		String x;
		int y;
		double z;
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		
		System.out.println("Dados digitados: ");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		
		sc.close();
	}

}
