package repetitivas;

import java.util.Scanner;

public class ExercicioGPT2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int senha, contador = 0;
				
		while (contador < 3) {
			System.out.print("Digite a senha: ");
			senha = sc.nextInt();
			contador = contador + 1;
			
			if(senha == 1234) {
				System.out.println("Acesso permitido!");
			}else {
				System.out.println("Senha incorreta");
			}
		}
		
		if(contador >= 3) {
			System.out.println("Conta bloqueada!");
		}
		
		sc.close();
	}

}
