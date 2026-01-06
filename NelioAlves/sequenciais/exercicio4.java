package NelioAlves.sequenciais;
import java.util.Scanner;

public class exercicio4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, d;
		System.out.print("Digite o valor A: ");
		a = sc.nextInt();
		System.out.print("Digite o valor B: ");
		b = sc.nextInt();
		System.out.print("Digite o valor C: ");
		c = sc.nextInt();
		System.out.print("Digite o valor D: ");
		d = sc.nextInt();
		
		int diferenca = a * b - c * d;
		
		System.out.println(diferenca);
		
		sc.close();
	}
}
