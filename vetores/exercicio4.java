package vetores;

import java.util.Locale;
import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números voce vai digitar? ");
        int n = sc.nextInt();

        int[] vect = new int[n];

        for (int i = 0; i<n; i++){
            System.out.print("Digite um número: ");
            vect[i] = sc.nextInt();
        }

        System.out.println("NUMEROS PARES: ");
        for (int i =0; i<n; i++){
            if (vect[i] % 2 == 0){
                System.out.print(vect[i] + " ");
            }
        }

        int even = 0;
        for (int i = 0; i<n; i++){
            if (vect[i] % 2 == 0){
                even += 1;
            }
        }
        System.out.printf("%nQUANTIDADE DE PARES: %d", even);


        sc.close();
    }
}
