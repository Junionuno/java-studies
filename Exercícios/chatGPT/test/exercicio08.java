package Exercícios.chatGPT.test;

import Exercícios.chatGPT.dominio.Aluno;
import Exercícios.chatGPT.dominio.Endereco;

import java.util.Scanner;

public class exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os dados: ");
        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Idade: ");
        int idade = sc.nextInt();

        System.out.print("Rua: ");
        sc.nextLine();
        String rua = sc.nextLine();

        System.out.print("Numero: ");
        int numero = sc.nextInt();

        System.out.print("Cidade: ");
        sc.nextLine();
        String cidade = sc.nextLine();

        System.out.print("Estado: ");
        String estado = sc.nextLine();

        Endereco endereco = new Endereco(rua, numero, cidade, estado);

        Aluno aluno = new Aluno(nome, idade, endereco);

        aluno.imprime();

        sc.close();
    }
}
