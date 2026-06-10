package Exercícios.IA.test;

import Exercícios.IA.dominio.Pagamento;
import Exercícios.IA.dominio.PagamentoCartao;

public class exercicio12 {
    public static void main(String[] args) {
        Pagamento pagamento = new Pagamento();
        pagamento.setValorBase(100);
        pagamento.setNome("Geraldo");
        pagamento.valorTotal();
        System.out.println(pagamento);

        System.out.println("-----------------");

        PagamentoCartao pagamento1 = new PagamentoCartao();
        pagamento1.setNome("Neto");
        pagamento1.setValorBase(100);
        pagamento1.pagamentoCartao();
        System.out.println(pagamento1);
    }
}
