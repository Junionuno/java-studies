package Exercícios.chatGPT.test;

import Exercícios.chatGPT.dominio.Conta;
import Exercícios.chatGPT.dominio.ContaCorrente;
import Exercícios.chatGPT.dominio.ContaPoupanca;

public class exercicio10 {
    public static void main(String[] args) {
        Conta conta = new ContaCorrente("Geraldo", 2000);
        Conta conta1 = new ContaPoupanca("Geraldo", 2000);

        conta.sacar(50);

        System.out.println(conta.toString());
        System.out.println(conta1.toString());
    }
}
