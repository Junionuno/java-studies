/*
1 - Faça um algoritmo que leia os valores de A, B, C e em seguida imprima na tela a soma entre A e B é mostre se a soma é menor que C.
*/

package Exercícios.devMagro;

public class exercicio1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 18;
        int c = 13;

        System.out.println(a + b);

        if ((a + b) < c){
            System.out.println("A soma entre A e B é maior que C!");
        }else{
            System.out.println("A soma entre A e B é menor que C!");
        }
    }
}
