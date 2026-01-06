package NelioAlves.condicionais;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double item, qtd;
		double total = 0;
		System.out.println("Digite o código do item e a quantidade desejada: ");
		item = sc.nextDouble();
		qtd = sc.nextDouble();
		
		if (item == 1) {
		   	total = qtd * 4;
		}else if (item == 2) {
			total = qtd * 4.50;
		}else if (item == 3) {
			total = qtd * 5;
		}else if (item == 4) {
			total = qtd * 2;
		}else if (item == 5) {
			total = qtd * 1.50;
		}
		
		System.out.printf("Total: R$" + total);
		sc.close();
	}

}
