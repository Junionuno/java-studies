package DevDojo.javacore.Npolimorfismo.test;

import DevDojo.javacore.Npolimorfismo.dominio.Computador;
import DevDojo.javacore.Npolimorfismo.dominio.Produto;
import DevDojo.javacore.Npolimorfismo.dominio.Tomate;
import DevDojo.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 20000);

        Tomate tomate = new Tomate("Americano", 28);

        tomate.setDataValidade("11/02/2026");

        CalculadoraImposto.calcularImposto(tomate);

    }
}
