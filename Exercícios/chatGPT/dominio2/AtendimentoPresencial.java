package Exercícios.chatGPT.dominio2;

public class AtendimentoPresencial extends Atendimento{
    public AtendimentoPresencial(String cliente, double valorBase) {
        super(cliente, valorBase);
    }

    @Override
    public double calculaValor() {
        return valorBase + (valorBase * 0.05);
    }
}
