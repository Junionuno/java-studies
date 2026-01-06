package NelioAlves.POO;

import NelioAlves.entities.BankAccount;

import java.util.Locale;
import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        BankAccount bank;

        System.out.print("Enter account number: ");
        int numberAc = sc.nextInt();
        System.out.print("Enter account holder: ");
        String name = sc.next();
        System.out.print("Is there a initial deposit (y/n)? ");
        char initialD = sc.next().charAt(0);

        if (initialD == 'y') {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            bank = new BankAccount(numberAc, name, initialDeposit);
        } else {
            bank = new BankAccount(numberAc, name);
        }
        System.out.println();

        System.out.println("Account data: ");
        System.out.println(bank);
        System.out.println();

        System.out.print("Enter a deposit value: ");
        double value = sc.nextDouble();
        bank.deposit(value);

        System.out.println();
        System.out.println("Updated data: ");
        System.out.println(bank);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        value = sc.nextDouble();
        bank.withdraw(value);
        System.out.println();

        System.out.print("Updated data: ");
        System.out.println(bank);

        sc.close();
    }
}
