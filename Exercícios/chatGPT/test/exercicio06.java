package Exercícios.chatGPT.test;

import Exercícios.chatGPT.dominio.ConverterDistancia;

import java.util.Locale;
import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor em metros: ");
        double amount = sc.nextDouble();

        double cm = ConverterDistancia.mToC(amount);
        System.out.println("Centímetros: " + cm);

        double mm = ConverterDistancia.mToM(amount);
        System.out.println("Milímetros: " + mm);

        double km = ConverterDistancia.mToQ(amount);
        System.out.println("Quilômetros: "+ km);

        sc.close();
    }
}
