package repetitivas;

import java.util.Scanner;

public class ExercicioGPT2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		int senha, contador = 0;
//				
//		while (contador < 3) {
//			System.out.print("Digite a senha: ");
//			senha = sc.nextInt();
//			contador = contador + 1;
//			
//			if(senha == 1234) {
//				System.out.println("Acesso permitido!");
//			}else {
//				System.out.println("Senha incorreta");
//			}
//		}
//		
//		if(contador >= 3) {
//			System.out.println("Conta bloqueada!");
//		}
		
//		int num, positivos = 0;
//		num = sc.nextInt();
//		
//		while (num != 0) {
//			if (num > 0) {
//				positivos += 1;
//			}
//			num = sc.nextInt();
//		}
//		
//		System.out.println("Positivos: " + positivos);
		
		int num, tab, contador = 0;
		System.out.println("Digite o número em que deseja ver a tabuada: ");
		num = sc.nextInt();
		
		while (contador <= 10) {
			tab = num * contador;
			System.out.println(num + "x" + contador + "=" + tab);
			contador += 1;
		}
		
		
		
		sc.close();
	}

}
