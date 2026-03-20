/*13 - Faça algoritmo que leia o nome e a idade de uma peso e imprima na tela o nome da pessoa e se ela é maior ou menor de idade. */

package Exercícios.devMagro;

public class exercicio13 {
    public static void main(String[] args) {
        String nome = "José";
        int idade = 14;

        if (idade >= 18){
            System.out.println(nome + " é maior de idade.");
        }else {
            System.out.println(nome + " é menor de idade.");
        }
    }
}
