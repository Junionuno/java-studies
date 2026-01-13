package Exercícios.chatGPT.test;

import Exercícios.chatGPT.dominio.Product;

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Product prod = new Product();

        System.out.println("Enter the product data: ");
        System.out.print("Name: ");
        prod.nome = sc.nextLine();
        System.out.print("Price: ");
        prod.price = sc.nextDouble();
        System.out.print("Quantity: ");
        prod.quantity = sc.nextInt();

        System.out.println(prod.imprime());

        System.out.print("Enter the amount to add: ");
        int amount = sc.nextInt();
        prod.addProducts(amount);

        System.out.println(prod.imprime());

        System.out.print("Enter the amount to remove: ");
        amount = sc.nextInt();
        prod.removeProducts(amount);

        System.out.println(prod.imprime());

        sc.close();
    }
}
