package Exercícios.chatGPT.test;

import Exercícios.chatGPT.dominio.CalculadoraVarargs;

public class exercicio01 {
    public static void main(String[] args) {
        CalculadoraVarargs calc = new CalculadoraVarargs();

        calc.soma(2, 5, 10);
        calc.soma(19, 31, 30);

        System.out.println("---------------------");

        calc.media(2.0, 3.5, 8.0);
        calc.media(4.0, 8.0, 10.0);

        System.out.println("---------------------");

        calc.maiorValor(4, 9, 1, 7);
        calc.maiorValor(12, 30, 41, 1);

        System.out.println("--------------------");

        calc.concatenaString("eu", "tu", "nós");
        calc.concatenaString("DevDojo", "Java", "Maratona");
    }
}
