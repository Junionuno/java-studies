package POO;

import util.FuelCalculator;

import java.util.Locale;
import java.util.Scanner;

public class exercicioGPT2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Total distance (km): ");
        double distance = sc.nextDouble();

        System.out.print("Car consumption (km/l): ");
        double consu = sc.nextDouble();

        System.out.print("Fuel price (R$): ");
        double price = sc.nextDouble();

        double FC = FuelCalculator.TotalCost(distance,consu,price);

        System.out.printf("Total trip cost: %.2f", FC);

        sc.close();
    }
}
