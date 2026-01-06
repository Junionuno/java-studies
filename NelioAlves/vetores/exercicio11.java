/*Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
de homens.*/

package NelioAlves.vetores;

import NelioAlves.entitiesVetores.PersonHeight;

import java.util.Locale;
import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();

        PersonHeight[] PersonHeight = new PersonHeight[n];

        double sumF = 0;
        int count = 0;
        int countM = 0;
        for (int i=0; i<n; i++){
            System.out.printf("Altura da %da pessoa: ", i + 1);
            double height = sc.nextDouble();

            System.out.printf("Genero da %da pessoa: ", i + 1);
            sc.nextLine();
            char sex = sc.next().toLowerCase().charAt(0);

            PersonHeight[i] = new PersonHeight(height, sex);

            if (sex == 'f'){
                sumF = sumF + PersonHeight[i].getHeight();
                count ++;
            }
            if (sex == 'm'){
                countM ++;
            }
        }

        double bigger = 0;

        for (int i = 0; i<n; i++){
            if (PersonHeight[i].getHeight() > bigger){
                bigger = PersonHeight[i].getHeight();
            }
        }
        System.out.println("Maior altura = " + bigger);


        double lower = PersonHeight[0].getHeight();
        for (int i = 0; i<n; i++){
            if (PersonHeight[i].getHeight() < lower){
                lower = PersonHeight[i].getHeight();
            }
        }
        System.out.println("Menor altura = " + lower);


        double mediaF = sumF / count;
        System.out.printf("Media das alturas das mulheres = %.2f%n", mediaF);

        System.out.println("Número de homens = " + countM);

        sc.close();
    }
}
