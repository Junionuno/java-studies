package NelioAlves.repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class main3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
//		float um, dois, tres, media;
//		
//		System.out.print("Digite a primeira nota: ");
//		um = sc.nextFloat();
//		
//		System.out.print("Digite a segunda nota: ");
//		dois = sc.nextFloat();
//		
//		System.out.print("Digite a terceira nota: ");
//		tres = sc.nextFloat();
//		
//		System.out.println("RESULTADO: ");
//		System.out.printf("Notas digitadas: %.2f, %.2f e %.2f %n", um, dois, tres);
//		
//		media = (um + dois + tres) / 3;
//		System.out.printf("Média: %.2f", media);
		
		int escolha;
		float temp, res;
		
		System.out.printf("SELECIONE O TIPO DE CONVERSÃO %n-----------------------------%n(1) DE CELSIUS PARA FAHRENHEIT %n(2) DE FARENHEIT PARA CELSIUS %nEscolha: ");
		escolha = sc.nextInt();
		

		if(escolha == 1) {
			System.out.print("Digite a temperatura em Celsius: ");
			temp = sc.nextFloat();
			res = (temp * 9/5) + 32;
			System.out.printf("%.1fºC = %.1fºF", temp, res);
		}else {
			System.out.print("Digite a temperatura em Fahrenheit: ");
			temp = sc.nextFloat();
			res = (temp - 32) * 5/9;
			System.out.printf("%.1fºF = %.1fºC", temp, res);
		}
		
		
		sc.close();
	}

}
