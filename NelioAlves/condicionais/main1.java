package NelioAlves.condicionais;

import java.util.Locale;
import java.util.Scanner;

public class main1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int min;
		double conta = 50;
		
		System.out.print("Quantos minutos a pessoa utilizou: ");
		min = sc.nextInt();
		
		if (min > 100) {
			conta += (min - 100) * 2;
			System.out.printf("Valor a pagar: R$%.2f", conta);
		}else {
			System.out.println("Valor a pagar: R$50.00");
		}
		
		sc.close();
	}

}
