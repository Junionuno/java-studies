/*Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
igual a 6.0 (seis).*/

package NelioAlves.vetores;

import java.util.Locale;
import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serão digitados: ");
        int n = sc.nextInt();

        String[] vectName = new String[n];
        double[] vectSt = new double[n];
        double[] vectNd = new double[n];

        for (int i=0;i<n;i++){
            System.out.printf("Digite nome, primeira e segunda nota do %do aluno: ", i + 1);
            sc.nextLine();
            vectName[i] = sc.nextLine();
            vectSt[i] = sc.nextDouble();
            vectNd[i] = sc.nextDouble();
        }

        System.out.println("ALUNOS APROVADOS: ");
        double media = 0;
        for (int i=0; i<n; i++) {
            if ((vectSt[i] + vectNd[i]) / 2 >= 6) {
                System.out.println(vectName[i]);
            }
        }

        sc.close();
    }
}
