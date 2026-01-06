package NelioAlves.repetitivas;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int escolha = 0;
		int alc = 0, gas = 0, die = 0;
		
		
		while(escolha != 4) {
			escolha = sc.nextInt();
			
			if (escolha > 4 || escolha < 1) {
				System.out.println("Código inválido, digite novamente: ");
			}else if(escolha == 1) {
				alc += 1;
			}else if(escolha == 2) {
				gas += 1;
			}else if(escolha == 3) {
				die += 1;
			}
		}
		
		System.out.println("MUITO OBRIGADO!");
		System.out.printf("Álcool: %d %nGasolina: %d %nDiesel: %d", alc, gas, die);
		
		sc.close();
	}
}
