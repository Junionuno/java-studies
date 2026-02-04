package DevDojo.javacore.Npolimorfismo.servico;

import DevDojo.javacore.Npolimorfismo.dominio.Computador;
import DevDojo.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    public static void calcularImpostoComputador (Computador computador){
        System.out.println("Relatório de imposto do computador");
        double imposto = computador.calcularImposto();
        System.out.println("Computador: " + computador.getNome());
        System.out.println("Valor: " + computador.getValor());
        System.out.printf("Valor a ser pago de imposto: %.2f%n", imposto);
    }

    public static void calcularImpostoTomate (Tomate tomate){
        System.out.println("Relatório de imposto do computador");
        double imposto = tomate.calcularImposto();
        System.out.println("Computador: " + tomate.getNome());
        System.out.println("Valor: " + tomate.getValor());
        System.out.printf("Valor a ser pago de imposto: %.2f%n", imposto);
    }
}
