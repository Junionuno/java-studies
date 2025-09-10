package repetitivas;

import java.util.Scanner;

public class ExercicioGPT {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		double notas = 0;
//		double media, soma = 0, contador = -1;		
//		
//		while (notas >= 0) {
//			contador = contador + 1;
//			soma += notas;
//			System.out.print("Digite a nota: ");
//			notas = sc.nextDouble();
//		}
//		
//		media = soma / contador;
//		System.out.println("Média: " + media);
	
		int num = 0, par = 0, impar = 0;
		num = sc.nextInt();
		
		while (num != 0) {	
			if (num % 2 == 0) {
				par += 1;
			}else {
				impar += 1;
			}
			num = sc.nextInt();
		}
		
		System.out.printf("Pares = %d Ímpares = %d", par, impar);
		
		sc.close();
	}

}
