package condicionais;

import java.util.Scanner;

public class main3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double preco;
		preco = sc.nextDouble();
		
		double desconto = (preco < 20) ? preco * 0.1 : preco * 0.05;  
		System.out.println(desconto);
		
		sc.close();
	}

}
