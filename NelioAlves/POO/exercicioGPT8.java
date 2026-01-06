package NelioAlves.POO;

import NelioAlves.entities.Tickets;

import java.util.Locale;
import java.util.Scanner;

public class exercicioGPT8 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Tickets ticket;
        System.out.print("Nome do evento: ");
        String name = sc.nextLine();
        System.out.print("Valor do ingresso: ");
        double price = sc.nextDouble();
        System.out.print("Possui ingressos disponíveis? (s/n) ");
        char choice = sc.next().charAt(0);
        if (choice == 'n'){
            ticket = new Tickets(name, price);
        }else{
            System.out.print("Quantos ingressos: ");
            int initialQuantity = sc.nextInt();
            ticket = new Tickets(name, price, initialQuantity);
        }

        System.out.println();
        System.out.println(ticket);

        System.out.println();
        System.out.print("Quantos ingressos deseja adicionar? ");
        int amount = sc.nextInt();
        ticket.addTickets(amount);

        System.out.println();
        System.out.println(ticket);

        System.out.println();
        System.out.print("Quantos ingressos foram vendidos? ");
        amount = sc.nextInt();
        ticket.sellTickets(amount);

        System.out.println();
        System.out.println(ticket);

        sc.close();
    }
}
