package vetores;

import entitiesVetores.BikeRent;

import java.util.Locale;
import java.util.Scanner;

public class desafioGPT {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        BikeRent[] bike = new BikeRent[8];

        System.out.print("Quantas bicicletas serão alugadas? ");
        int n = sc.nextInt();

        for (int i = 1; i<=n;i++){
            System.out.println("Aluguel #" + i );
            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Telefone: ");
            String phone = sc.nextLine();
            System.out.print("Bicicleta: ");
            int bikeNumber = sc.nextInt();

            bike[bikeNumber] = new BikeRent(name, phone);
        }

        System.out.println("Bicicletas alugadas: ");
        for (int i=0;i<=7;i++){
            if(bike[i] != null){
                System.out.println(i + ": " + bike[i]);
            }
        }

        sc.close();
    }
}
