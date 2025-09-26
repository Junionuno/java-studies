package repetitivas;

import java.util.Scanner;

public class main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float temp, res;
        char escolha;

        do{
            System.out.print("Digite a temperatura em Celsius:");
            temp = sc.nextInt();
            res = (temp * 9/5) + 32;
            System.out.printf("Equivalente em Fahrenheit: %.1f%n", res);
            System.out.print("Deseja repetir (s/n)? ");
            escolha = sc.next().charAt(0);
        }while(escolha != 'n');

        /*if(escolha == 1) {
            System.out.print("Digite a temperatura em Celsius: ");
            temp = sc.nextFloat();
            res = (temp * 9/5) + 32;
            System.out.printf("%.1fºC = %.1fºF", temp, res);
        }else {
            System.out.print("Digite a temperatura em Fahrenheit: ");
            temp = sc.nextFloat();
            res = (temp - 32) * 5/9;
            System.out.printf("%.1fºF = %.1fºC", temp, res);
        }*/

        sc.close();
    }
}
