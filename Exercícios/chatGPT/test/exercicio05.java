package Exercícios.chatGPT.test;

import Exercícios.chatGPT.dominio.Produto;

import java.io.NotActiveException;
import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Produto prod = new Produto();
        System.out.print("Enter product name: ");
        String nome = sc.nextLine();
        System.out.print("Enter product price: ");
        double price = sc.nextDouble();
        prod = new Produto(nome, price);

        System.out.println(prod.toStrig());

        sc.close();
    }
}
