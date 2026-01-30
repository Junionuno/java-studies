package Exercícios.chatGPT.dominio2;

public abstract class Entrega implements Calculavel{
    protected String nome;
    protected double valorBase;
    private StatusEntrega status = StatusEntrega.PENDENTE;

    public Entrega(String nome, double valorBase) {
        this.nome = nome;
        this.valorBase = valorBase;
    }

    @Override
    public String toString() {
        return "Entrega \n" +
                "\nNome = " + nome + "\nValor Base = " + valorBase +
                "\nValor final = " + calcularValorFinal() +
                "\nStatus = " + status.getCodigo() + " " + status.getDescricao() + "\n";
    }

    public void alteraStatus(StatusEntrega status){
        this.status = status;
    }


}
