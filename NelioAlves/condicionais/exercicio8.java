package NelioAlves.condicionais;

import java.util.Locale;
import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double renda, imposto;
		System.out.println("Digite sua renda:");
		renda = sc.nextDouble();
		
		if (renda <= 2000) {
			System.out.println("Isento");
		}else if(renda > 2000 && renda <= 3000) {
			imposto = (renda - 2000) * 8 / 100;
			System.out.println("R$ " + imposto);
		}else if(renda > 3000 && renda <= 4500) {
			imposto = 1000 * 8/100;
			imposto += imposto = (renda - 3000) * 18 / 100;
			System.out.println("R$ " + imposto);
		}else {
			imposto = (renda - 4500) * 0.28 + 1500 * 0.18 + 1000 * 0.08;
			System.out.println("R$ " + imposto);
		}
		
		
		
		
		sc.close();
	}

}
