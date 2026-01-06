package NelioAlves.repetitivas;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            System.out.print(i+" ");
            int resultQuad = (int) Math.pow(i,2);
            System.out.print(resultQuad+" ");
            int resultCubo = (int) Math.pow(i,3);
            System.out.println(resultCubo+" ");
        }

        sc.close();
    }
}
