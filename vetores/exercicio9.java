/*Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
da pessoa mais velha.*/

package vetores;

import java.util.Locale;
import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas você vai cadastrar: ");
        int n = sc.nextInt();

        String[] vectName = new String[n];
        int[] vectAge = new int[n];

        String name = " ";
        int bigger = 0;
        for (int i = 0; i<n; i++){
            System.out.printf("Dados da %da pessoa: %n", i + 1);
            System.out.print("Nome: ");
            sc.nextLine();
            vectName[i] = sc.nextLine();

            System.out.print("Idade: ");
            vectAge[i] = sc.nextInt();

            if (vectAge[i] > bigger){
                bigger = vectAge[i];
                name = vectName[i];
            }
        }

        System.out.print("PESSOA MAIS VELHA: " + name);


        System.out.println();

        sc.close();
    }
}
