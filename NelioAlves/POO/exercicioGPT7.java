package NelioAlves.POO;

import NelioAlves.entities.Library;

import java.util.Locale;
import java.util.Scanner;

public class exercicioGPT7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Library lib;
        System.out.print("Digite o título do livro: ");
        String title = sc.nextLine();
        System.out.print("Digite o autor do livro: ");
        String author = sc.nextLine();
        System.out.print("Você já possui alguma unidade desse livro? (s/n) ");
        char choice = sc.next().charAt(0);
        if(choice == 's'){
            System.out.print("Quantas? ");
            int initialQtd = sc.nextInt();
            lib = new Library(title, author, initialQtd);
        }else{
            lib = new Library(title, author);
        }

        System.out.println(lib);

        System.out.println();
        System.out.print("Quantos livros você quer adicionar? ");
        int amount = sc.nextInt();
        lib.addBooks(amount);
        System.out.println();

        System.out.println(lib);

        System.out.println();
        System.out.print("Quantos livros você quer remover? ");
        amount = sc.nextInt();
        lib.removeBooks(amount);
        System.out.println();

        System.out.println(lib);


        sc.close();
    }
}
