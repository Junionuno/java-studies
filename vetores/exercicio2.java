package vetores;

import java.util.Locale;
import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        double[] vect = new double[n];

        for (int i = 0; i<n; i++){
            System.out.print("Digite um número: ");
            vect[i] = sc.nextDouble();
        }

        System.out.print("VALORES = ");
        for (int i = 0; i<n; i++){
            System.out.print(vect[i] + " ");
        }

        double sum = 0;
        for (int i = 0; i<n; i++){
            sum += vect[i];
        }
        System.out.printf("%nSOMA = %.2f", sum);

        double media = sum / vect.length;

        System.out.printf("%nMEDIA = %.2f", media);

        sc.close();
    }
}
