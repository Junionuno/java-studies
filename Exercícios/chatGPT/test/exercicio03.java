package Exercícios.chatGPT.test;

import Exercícios.chatGPT.dominio.Carro;

import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Carro car = new Carro();

        System.out.println("Enter car data: ");
        System.out.print("Brand: ");
        String marca = sc.nextLine();
        car.setMarca(marca);

        System.out.print("Model: ");
        String modelo = sc.nextLine();
        car.setModelo(modelo);

        System.out.print("Year: ");
        int ano = sc.nextInt();
        car.setAno(ano);

        System.out.print("Price: ");
        double preco = sc.nextDouble();
        car.setPreco(preco);

        car.imprime();

        System.out.println("Enter new price: ");
        preco = sc.nextDouble();
        car.setPreco(preco);

        System.out.println("Updated car data: ");

        car.imprime();

        sc.close();
    }
}
