/*15 - Faça um algoritmo que leia três valores que representam os três lados de um triângulo e verifique se são válidos, determine se o triângulo é
equilátero, isósceles ou escaleno.*/

package Exercícios.devMagro;

public class exercicio15 {
    public static void main(String[] args) {
        int ladoA = 12;
        int ladoB = 11;
        int ladoC = 12;

        if (ladoA > 0 && ladoB > 0 && ladoC > 0) {
            if (ladoA == ladoB && ladoB == ladoC) {
                System.out.println("Trângulo equilátero!");
            } else if (ladoA == ladoB || ladoB == ladoC || ladoA == ladoC) {
                System.out.println("Triângulo isócseles!");
            } else {
                System.out.println("Triângulo escaleno!");
            }
        }else {
            System.out.println("Valores inválidos");
        }

    }
}
