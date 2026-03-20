/*19 - Faça um algoritmo que mostre um valor aleatório entre 0 e 100.*/

package Exercícios.devMagro;

import java.util.Random;

public class exercicio19 {
    public static void main(String[] args) {
        Random num = new Random();

        int valor = num.nextInt(100) + 1;

        System.out.println(valor);
    }
}
