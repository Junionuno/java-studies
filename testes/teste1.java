package testes;

import java.util.Scanner;

public class teste1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*System.out.print("Digite sua senha: ");
        int senha = sc.nextInt();

        while(senha != 2002){
            System.out.print("Senha inválida, digite novamente: ");
            senha = sc.nextInt();
        }

        System.out.println("Acesso permitido!");*/

        /*System.out.println("Digite a coordenada X, Y: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        while(x != 0 || y != 0){
            if (x > 0 & y > 0){
                System.out.println("Primeiro");
            }else if(x < 0 & y > 0){
                System.out.println("Segundo");
            } else if(x < 0 & y < 0){
                System.out.println("Terceiro");
            }else {
                System.out.println("Quarto");
            }

            System.out.println("Digite a coordenada X, Y: ");
            x = sc.nextInt();
            y = sc.nextInt();
        }*/

        System.out.println("Digite o combustível desejado: 1.Álcool 2.Gasolina 3.Diesel 4.Fim");
        int comb = sc.nextInt();
        int alc = 0;
        int gas = 0;
        int diesel = 0;

        while(comb != 4){
            if (comb == 1){
                alc ++;
            }else if(comb == 2){
                gas ++;
            }else if(comb == 3){
                diesel ++;
            }
            comb = sc.nextInt();


        System.out.printf("Muito obrigado!%nAlcool: %d%nGasolina: %d%nDiesel: %d", alc, gas, diesel);


        sc.close();
    }
}
