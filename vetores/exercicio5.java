package vetores;

import java.util.Locale;
import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números voce vai digitar? ");
        int n = sc.nextInt();

        double[] vect = new double[n];

        for (int i = 0; i<n; i++){
            System.out.print("Digite um número: ");
            vect[i] = sc.nextInt();
        }

        double bigger = vect[0];
        double posmaior = 0;

        for (int i = 0; i<n; i++){
            if (vect[i]>bigger){
                bigger = vect[i];
                posmaior = i;
            }
        }

        System.out.printf("MAIOR VALOR: %.2f%n", bigger);
        System.out.printf("POSIÇÃO DO MAIOR VALOR: %.0f", posmaior);

        sc.close();
    }
}
