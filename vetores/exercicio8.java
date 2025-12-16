/*Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
digitado, mostrar a mensagem "NENHUM NUMERO PAR"*/

package vetores;

import java.util.Locale;
import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        int[] vect = new int[n];

        int sum = 0, cont =0;
        for (int i = 0; i<n; i++){
            System.out.print("Digite um número: ");
            vect[i] = sc.nextInt();
            if (vect[i] % 2 == 0){
                sum = sum + vect[i];
                cont ++;
            }
        }

        int media = 0;
        if (sum > 0){
            media = sum / cont;
            System.out.println("MEDIA DOS PARES: " + media);
        }else {
            System.out.println("NENHUM NUMERO PAR");
        }


        sc.close();
    }
}
