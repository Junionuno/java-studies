package DevDojo.javacore.Npolimorfismo.test;

import DevDojo.javacore.Npolimorfismo.dominio.Computador;
import DevDojo.javacore.Npolimorfismo.dominio.Tomate;
import DevDojo.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Tomate tomate = new Tomate("Cereja", 15);
        Computador computador = new Computador("Alienware", 18000);

        CalculadoraImposto.calcularImpostoTomate(tomate);
        System.out.println("----------------------");
        CalculadoraImposto.calcularImpostoComputador(computador);
    }
}
