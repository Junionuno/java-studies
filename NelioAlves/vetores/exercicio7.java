/*Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.*/



        package NelioAlves.vetores;

import java.util.Locale;
import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos terá o vetor? ");
        int n = sc.nextInt();

        double[] vect = new double[n];

        double sum = 0;
        for (int i=0; i<n; i++){
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
            sum = sum + vect[i];
        }

        double media = sum / vect.length;
        System.out.println("MÉDIA DO VETOR = " + media);

        System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
        for (int i=0; i<n; i++){
            if (vect[i] < media){
                System.out.println(vect[i]);
            }
        }



        sc.close();
    }
}
