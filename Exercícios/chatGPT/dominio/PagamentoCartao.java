package Exercícios.chatGPT.dominio;

public class PagamentoCartao extends Pagamento {
    public static final double TAXCARTAO = 0.03;

    public final double pagamentoCartao(){
        return valorTotal() - valorTotal() * TAXCARTAO;
    }

    @Override
    public String toString() {
        return super.toString() + " Valor total no cartão: " + pagamentoCartao();
    }
}
