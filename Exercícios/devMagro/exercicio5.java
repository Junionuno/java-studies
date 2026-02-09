/*
5 - Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário, calcule quantos salários mínimos esse
usuário ganha e imprima na tela o resultado. (Base para o Salário mínimo R$ 1.293,20).
*/

package Exercícios.devMagro;

public class exercicio5 {
    public static void main(String[] args) {
        double salMinimo = 1293.20;
        double salUsuario =  2586.40;

        double res = salUsuario / salMinimo;

        System.out.printf("O usuário recebe o total de %.1f sálarios minimos!", res);
    }
}
