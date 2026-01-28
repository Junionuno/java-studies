package Exercícios.chatGPT.dominio2;

public class PagamentoDinheiro extends Pagamento{
    public PagamentoDinheiro(String nome, double valorBase) {
        super(nome, valorBase);
    }

    @Override
    public double valorTotal() {
        return valorBase = valorBase - valorBase * 0.05;
    }
}
