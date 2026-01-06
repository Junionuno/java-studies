package NelioAlves.sequenciais;
import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int codigo1;
		int qtd1;
		double valor1;
		
		System.out.println("Digite as informações da primeira peça: ");
		codigo1 = sc.nextInt();
		qtd1 = sc.nextInt();
		valor1 = sc.nextDouble();
		
		int codigo2;
		int qtd2;
		double valor2;
		
		System.out.println("Digite as informações da segunda peça: ");
		codigo2 = sc.nextInt();
		qtd2 = sc.nextInt();
		valor2 = sc.nextDouble();
		
		double total1= qtd1 * valor1;
		double total2= qtd2 * valor2;
		
		double total = total1 + total2;
		
		System.out.printf("VALOR A PAGAR: %.2f", total);
		
		sc.close();
	}

}
