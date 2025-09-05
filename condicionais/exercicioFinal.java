package condicionais;

import java.util.Scanner;

public class exercicioFinal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nome, dia;
		int idade, x;
		double salario;
		
		System.out.print("Qual seu nome: ");
		nome = sc.nextLine();
		System.out.print("Qual a sua idade: ");
		idade = sc.nextInt();
		System.out.print("Qual o dia: ");
		x = sc.nextInt();
		System.out.print("Qual o seu salário: ");
		salario = sc.nextDouble();
		System.out.printf("%n");
		
		System.out.println("Cadastro realizado: ");
		System.out.printf("NOME: %s%n", nome);
		
		if (idade < 12) {
			System.out.printf("Idade: %d (criança)%n", idade);
		}else if(idade <= 17){
			System.out.printf("Idade: %d (adolescente)%n", idade);
		}else if(idade <= 59) {
			System.out.printf("Idade: %d (adulto)%n", idade);
		}else {
			System.out.printf("Idade: %d (idoso)%n", idade);
		}
		
		System.out.printf("Salário: R$ %.2f%n", salario);
		
		switch (x) {
		case 1:
			dia = "Domingo";
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
			dia = "Dia inválido";
			break;	
		}
		
		System.out.printf("Dia da semana: %s%n", dia);
		
		if (salario > 3000 && idade > 18) {
			System.out.println("Apto a crédito especial!");
		}else {
			System.out.println("Não apto a crédito especial!");
		}
		
		double desconto = (salario < 2000) ? salario * 0.15 : salario * 0.05;
		System.out.printf("Desconto aplicado: R$ %.2f", desconto);
		
		sc.close();
	}

}
