package Exercícios.IA.test;

import Exercícios.IA.dominio2.Pagamento;
import Exercícios.IA.dominio2.PagamentoCartao;
import Exercícios.IA.dominio2.PagamentoDinheiro;

public class exercicio17 {
    public static void main(String[] args) {
        Pagamento pagamento = new PagamentoCartao("Geraldo", 100);
        Pagamento pagamento1 = new PagamentoDinheiro("Geraldo", 100);

        System.out.println(pagamento);
        System.out.println(pagamento1);
    }
}
