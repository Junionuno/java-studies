/*16 - Faça um algoritmo que leia uma temperatura em Fahrenheit e calcule a temperatura correspondente em grau Celsius. Imprima na tela as duas temperaturas.
Fórmula: C = (5 * ( F-32) / 9)*/

package Exercícios.devMagro;

public class exercicio16 {
    public static void main(String[] args) {
        double fahrenheit = 50.8;

        double celsius = (5 * (fahrenheit-32)/9);

        System.out.printf("Celsius: %.2f%nFahrenheit: %.2f", celsius, fahrenheit);
    }
}
