package vetores;

import java.util.Locale;
import java.util.Scanner;

public class arraysMultidimensionais {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int[][] dias = new int[3][3];

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[0].length; j++) {
                if (j == 0){
                    System.out.print("Janeiro: ");
                    int dia = sc.nextInt();
                    dias[i][j] = dia;
                }else if (j == 1){
                    System.out.print("Fevereiro: ");
                    int dia = sc.nextInt();
                    dias[i][j] = dia;
                } else if (j == 2) {
                    System.out.print("Março: ");
                    int dia = sc.nextInt();
                    dias[i][j] = dia;
                }

            }
        }

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.print(dias[i][j] + " ");
            }
        }

        for (int[] arrBase : dias){
            for (int num : arrBase){
                System.out.println(num);
            }
        }
    }
}
