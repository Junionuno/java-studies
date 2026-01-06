package NelioAlves.condicionais;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		System.out.println("Digite dois números: ");
		a = sc.nextInt();
		b = sc.nextInt();
		

		if ((a % b == 0) || ( b % a == 0)) {
			System.out.println("São múltiplos!");
		}else {
			System.out.println("Não são múltiplos!");
		}
		
		sc.close();
	}

}
