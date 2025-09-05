package sequenciais;
import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int valor1;
		int valor2;
		
		System.out.print("Digite o primeiro valor: ");
		valor1 = sc.nextInt();
		System.out.print("Digite o segundo valor: ");
		valor2 = sc.nextInt();
		
		int soma = valor1 + valor2;
		
		System.out.print("Soma: " + soma);
		
		sc.close();
	}

}
