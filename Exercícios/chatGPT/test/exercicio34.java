package Exercícios.chatGPT.test;

import Exercícios.chatGPT.dominio3.Calculadora;
import Exercícios.chatGPT.dominio3.DivisaoPorZeroException;

public class exercicio34 {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora(5, 9);

        System.out.println(calc.soma());
        try {
            System.out.println(calc.divide());
        } catch (DivisaoPorZeroException e) {
            System.out.println("ERRO: " + e.getMessage());
        }

        Calculadora calc1 = new Calculadora(16, 0);

        System.out.println(calc.multiplica());
        try {
            System.out.println(calc1.divide());
        } catch (DivisaoPorZeroException e) {
            System.out.println("ERRO: " + e.getMessage());
        }finally {
            System.out.println("Operação concluída.");
        }
    }
}
