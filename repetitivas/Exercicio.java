package repetitivas;

import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a sua senha: ");
		int senha = sc.nextInt();
		
		while (senha != 2002) {
			System.out.print("Senha incorreta, digite novamente: ");
			senha = sc.nextInt();
		}
		System.out.println("Acesso permitido!");
		
		sc.close();
	}

}
