package NelioAlves.condicionais;

import java.util.Scanner;

public class ExercicioGpt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		int num;
//		System.out.print("Digite um número para verificar: ");
//		num = sc.nextInt();
//		
//		if (num % 2 == 0) {
//			System.out.printf("O número %d é par", num);
//		}else {
//			System.out.printf("O número %d é Ímpar", num);
//		}
		
//		double valor = 50.0;
//		int min;
//		
//		min = sc.nextInt();
//		
//		if (min > 100) {
//			valor += (min - 100) * 2; 
//		}
//		
//		System.out.printf("Valor da conta = R$ %.2f", valor);
		
//		int num;
//		String dia;
//		
//		System.out.print("Digite um número: ");
//		num = sc.nextInt();
//		
//		switch (num) {
//		case 1:
//			dia = "Domingo";
//			break;
//		case 2:
//			dia = "Segunda";
//			break;
//		case 3:
//			dia = "Terça";
//			break;
//		case 4: 
//			dia = "Quarta";
//			break;
//		case 5:
//			dia = "Quinta";
//			break;
//		case 6:
//			dia = "Sexta";
//			break;
//		case 7:
//			dia = "Sábado";
//			break;
//		default:
//			dia = "Dia inválido!";
//			break;
//		}
//		
//		System.out.println(dia);
		
//		int idade;
//		System.out.println("Digite sua idade: ");
//		idade = sc.nextInt();
//		
//		if (idade < 12) {
//			System.out.println("Criança");
//		}else if(idade >= 12 && idade <= 17) {
//			System.out.println("Adolescente");
//		}else if(idade >= 18 && idade <= 59) {
//			System.out.println("Adulto");
//		}else {
//			System.out.println("Idoso");
//		}
		
		double valor;
		System.out.print("Digite o valor do produto: R$");
		valor = sc.nextDouble();
		
		double desconto = (valor > 100) ? valor * 0.05 : valor * 0.1;
		
		System.out.printf("Preço original: R$%.2f%nDesconto aplicado: R$%.2f", valor, desconto);
		
		sc.close();	
	}

}
