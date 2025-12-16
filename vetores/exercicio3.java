package vetores;

import entitiesVetores.Person;

import java.util.Locale;
import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();

        Person[] vect = new Person[n];

        for (int i = 0; i<n; i++){
            System.out.printf("Dados da %da pessoa:%n", i + 1);
            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Idade: ");
            int age = sc.nextInt();
            System.out.print("Altura: ");
            double height = sc.nextDouble();

            vect[i] = new Person(name, age, height);
        }

        double sum = 0;
        for (int i = 0; i<n; i++){
            sum += vect[i].getHeight();
        }
        double media = sum / vect.length;
        System.out.printf("Altura média: %.2f%n", media);

        System.out.print("Pessoas com menos de 16 anos: ");
        double youngest = 0;
        for (int i = 0; i<n; i++){
            if (vect[i].getAge() < 16){
                youngest += 1;
            }
        }
        youngest = youngest * 100 / vect.length;
        System.out.printf("%.2f%%%n", youngest);
        for (int i = 0; i<n; i++){
            if (vect[i].getAge() < 16){
                System.out.println(vect[i].getName());
            }
        }
        sc.close();
    }
}
