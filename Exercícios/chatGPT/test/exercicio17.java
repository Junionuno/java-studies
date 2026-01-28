package Exercícios.chatGPT.test;

import Exercícios.chatGPT.dominio2.Pagamento;
import Exercícios.chatGPT.dominio2.PagamentoCartao;
import Exercícios.chatGPT.dominio2.PagamentoDinheiro;

public class exercicio17 {
    public static void main(String[] args) {
        Pagamento pagamento = new PagamentoCartao("Geraldo", 100);
        Pagamento pagamento1 = new PagamentoDinheiro("Geraldo", 100);

        System.out.println(pagamento);
        System.out.println(pagamento1);
    }
}
