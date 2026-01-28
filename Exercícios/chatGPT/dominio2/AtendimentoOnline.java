package Exercícios.chatGPT.dominio2;

public class AtendimentoOnline extends Atendimento{
    public AtendimentoOnline(String cliente, double valorBase) {
        super(cliente, valorBase);
    }

    @Override
    public double calculaValor() {
        return valorBase - (valorBase * 0.05);
    }
}
