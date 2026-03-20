/*17 - Faça um algoritmo que imprima na tela a tabuada de 1 até 10.*/

package Exercícios.devMagro;

public class exercicio17 {
    public static void main(String[] args) {

        int count = 1;
        for (int i=1; i <= 10; i ++){
            System.out.println("Tabuada do " + i);
            for (int j = 0; j <10; j++){
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }
}
