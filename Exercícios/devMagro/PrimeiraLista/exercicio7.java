/*
7 - Faça um algoritmo que leia dois valores booleanos (lógicos) e determine se ambos são VERDADEIRO ou FALSO.
*/

package Exercícios.devMagro;

public class exercicio7 {
    public static void main(String[] args) {
        boolean verdade = true;
        boolean falso = false;

        if (!verdade && falso){
            System.out.println("Ambos são verdadeiros!");
        }else if(!verdade && falso){
            System.out.println("Ambos são falsos!");
        }else {
            System.out.println("São valores diferentes!");
        }
    }
}
