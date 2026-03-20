/*10 - Faça um algoritmo que leia três notas obtidas por um aluno, e imprima na tela a média das notas.*/

package Exercícios.devMagro;

public class exercicio10 {
    public static void main(String[] args) {
        double notaA = 8;
        double notaB = 7.9;
        double notaC = 9;
        double soma = notaA + notaB + notaC;
        double media = soma / 3;

        System.out.printf("A média do aluno foi de: %.2f", media);

    }
}
