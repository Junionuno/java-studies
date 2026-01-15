package Exercícios.chatGPT.test;

import Exercícios.chatGPT.dominio.ContaBancaria;

import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ContaBancaria conta;

        System.out.print("Conta: ");
        int count = sc.nextInt();

        System.out.print("Titular: ");
        sc.nextLine();
        String name = sc.nextLine();

        System.out.print("Haverá um saldo inicial? S/N ");
        char d = sc.nextLine().charAt(0);

        if(d == 'S' || d == 's'){
            System.out.print("Qual o valor? ");
            double value = sc.nextDouble();
            conta = new ContaBancaria(count, name, value);
        }else {
            conta = new ContaBancaria(count, name);

        }

        System.out.println(conta.toString());;

        System.out.println("---------------------------------");
        System.out.print("Digite o valor para depósito: ");
        double amount = sc.nextDouble();
        conta.deposit(amount);

        System.out.println(conta.toString());

        System.out.println("---------------------------------");
        System.out.print("Digite o valor para saque: ");
        amount = sc.nextDouble();
        conta.withDraw(amount);

        System.out.println(conta.toString());

        sc.close();
    }
}
