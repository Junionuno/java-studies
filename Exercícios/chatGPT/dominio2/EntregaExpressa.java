package Exercícios.chatGPT.dominio2;

public class EntregaExpressa extends Entrega{
    public EntregaExpressa(String nome, double valorBase) {
        super(nome, valorBase);
    }

    @Override
    public double calcularValorFinal() {
        return valorBase + 10;
    }
}
