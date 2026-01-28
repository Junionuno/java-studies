package Exercícios.chatGPT.dominio2;

public class PagamentoCartao extends Pagamento{
    public PagamentoCartao(String nome, double valorBase) {
        super(nome, valorBase);
    }

    @Override
    public double valorTotal() {
        return valorBase = valorBase + valorBase * 0.05;
    }
}
