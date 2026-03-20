/*
2 - Faça um algoritmo para receber um número qualquer e imprimir na tela se o número é par ou ímpar, positivo ou negativo.
*/

package Exercícios.devMagro;

public class exercicio2 {
    public static void main(String[] args) {
        int num = 10;

        if (num % 2 == 0){
            System.out.print("O número é par, ");
        }else{
            System.out.print("O número é ímpar, ");
        }

        if (num > 0){
            System.out.print("e positivo.");
        }else{
            System.out.print("e negativo.");
        }
    }
}
