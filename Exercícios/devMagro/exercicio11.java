/*11 - Faça um algoritmo que leia quatro notas obtidas por um aluno, calcule a média das nota obtidas, imprima na tela o nome do aluno e
se o aluno foi aprovado ou reprovado. Para o aluno ser considerado aprovado sua média final deve ser maior ou igual a 7.*/

package Exercícios.devMagro;

public class exercicio11 {
    public static void main(String[] args) {
        String nome = "Heitor";
        double notaA = 9;
        double notaB = 7.4;
        double notaC = 4.9;
        double notaD = 5.3;

        double soma = notaA + notaB + notaC + notaD;
        double media = soma / 4;

        if (media >= 7){
            System.out.println(nome + " Aprovado!");
        }else{
            System.out.println(nome + " Reprovado!");
        }
    }
}
