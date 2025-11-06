package testes;

import java.util.Scanner;

public class teste1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*System.out.println("Digite dois números: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("Digite a operação que deseja realizar soma (+), subtração (-), multiplicação (*) ou divisão (/)");
        String operation = sc.next();

        switch (operation){
            case "+":
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
            case "*":
                System.out.println(num1 * num2);
                break;
            case "/":
                System.out.println(num1 / num2);
                break;
            default:
                System.out.println("Operação inválida!");
        }*/

        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        for (int i = 1; i <= num ; i++){
            System.out.println(i);
        }

        sc.close();
    }
}
