/*20 - Faça um algoritmo que leia dois valores inteiros A e B, imprima na tela o quociente e o resto da divisão inteira entre eles.*/

package Exercícios.devMagro;

public class exercicio20 {
    public static void main(String[] args) {
        int a = 48;
        int b = 32;

        double quociente = a / b;
        double resto = a % b;

        System.out.println("Quociente: " + quociente);
        System.out.println("Resto: " + resto);
    }
}
