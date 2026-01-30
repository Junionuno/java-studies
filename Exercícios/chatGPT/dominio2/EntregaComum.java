package Exercícios.chatGPT.dominio2;

public class EntregaComum extends Entrega{

    public EntregaComum(String nome, double valorBase) {
        super(nome, valorBase);
    }

    @Override
    public double calcularValorFinal() {
        return valorBase + 5;
    }
}
