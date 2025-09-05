package condicionais;

import java.util.Scanner;

public class main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String dia;
		int x;
		System.out.print("Qual o número do dia? ");
		x = sc.nextInt();
		
		switch(x) {
		case 1:
			dia = "Domingo!";
			break;
		case 2:
			dia = "Segunda";
			break;
		case 3:
			dia = "Terça";
			break;
		case 4:
			dia = "Quarta";
			break;
		case 5:
			dia = "Quinta";
			break;
		case 6:
			dia = "Sexta";
			break;
		case 7:
			dia = "Sábado";
			break;
		default:
			dia = "valor inválido!";
			break;
		}
		
		System.out.println(dia);
		sc.close();
	}

}
