package NelioAlves.sequenciais;
import java.util.Locale;
import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int codigo;
		int hora;
		double valor;
		
		System.out.print("Digite o código do funcionário: ");
		codigo = sc.nextInt();
		System.out.print("Digite quantas horas o funcionário trabalha: ");
		hora = sc.nextInt();
		System.out.print("Digite o valor que da hora: ");
		valor = sc.nextDouble();
		
		double salario = hora * valor;
		
		Locale.setDefault(Locale.US);
		System.out.printf("NUMBER = %d %nSALARY = U$ %.2f", codigo, salario);
		
		sc.close();
	}

}
