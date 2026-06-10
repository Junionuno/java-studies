package Exercícios.IA.test;

import Exercícios.IA.dominio.Conta;
import Exercícios.IA.dominio.ContaCorrente;
import Exercícios.IA.dominio.ContaPoupanca;

public class exercicio10 {
    public static void main(String[] args) {
        Conta conta = new ContaCorrente("Geraldo", 2000);
        Conta conta1 = new ContaPoupanca("Geraldo", 2000);

        conta.sacar(50);

        System.out.println(conta.toString());
        System.out.println(conta1.toString());
    }
}
