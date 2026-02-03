package Exercícios.curso.test;

import Exercícios.curso.dominio.Conta;
import Exercícios.curso.dominio.ContaCorrente;
import Exercícios.curso.dominio.SeguroDeVida;
import Exercícios.curso.dominio.Tributavel;

public class ContaTest01 {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(2000);
        SeguroDeVida sv = new SeguroDeVida();

        System.out.println("Saldo CC: " + cc.obterSaldo());
        System.out.println("Tributos CC: " + cc.calculaTributos());
        System.out.println("Tributos Seguro: " + sv.calculaTributos());


    }
}
