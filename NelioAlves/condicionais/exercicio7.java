package NelioAlves.condicionais;

import java.util.Scanner;

public class exercicio7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double y, x;
		System.out.println("Digite as duas coordenadas: ");
		y = sc.nextDouble();
		x = sc.nextDouble();
		
		if (y == 0 && x == 0) {
			System.out.println("Origem");
		}else if (y > 0 && x > 0){
			System.out.println("Q1");
		}else if (y > 0 && x < 0) {
			System.out.println("Q2");
		}else if (y < 0 && x < 0) {
			System.out.println("Q3");
		}else {
			System.out.println("Q4");
		}
		
		sc.close();
	}
}
