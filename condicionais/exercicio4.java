package condicionais;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hi, hf;
		System.out.println("Digite a hora inicial e a hora final do jogo: ");
		hi = sc.nextInt();
		hf = sc.nextInt();
		
		int duracao;
		
		if (hi < hf) {
			duracao = hi - hf;
		}else {
			duracao = 24 - hi + hf;
		}
		
		System.out.println(duracao);
		
		sc.close();
	}

}
