package repetitivas;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        float num, soma = 0, result;


        for (int i = 0; i < n; i++) {
            for (int ii = 1; ii < 4; ii++) {
                num = sc.nextFloat();
                if (ii == 1) {
                    soma = soma + num * 2;
                } else if (ii == 2) {
                    soma = soma + num * 3;
                } else {
                    soma = soma + num * 5;
                }
            }
            result = soma / (2 + 3 + 5);
            System.out.printf("O resultado da média ponderada é: %.1f %n", result);
            soma = 0;
        }

        sc.close();
    }
}
