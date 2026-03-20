/*14 - Faça um algoritmo que receba um valor A e B, e troque o valor de A por B e o valor de B por A e imprima na tela os valores.*/

package Exercícios.devMagro;

public class exercicio14 {
    public static void main(String[] args) {
        int a = 8;
        int b = 16;
        int temp;

        temp = a;
        a = b;
        b = temp;

        System.out.println(a + " " + b);
    }
}
