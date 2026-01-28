package Exercícios.chatGPT.dominio2;

public abstract class Atendimento {
    protected String cliente;
    protected double valorBase;
    public StatusAtendimento status = StatusAtendimento.ABERTO;

    public Atendimento(String cliente, double valorBase) {
        this.cliente = cliente;
        this.valorBase = valorBase;
    }

    @Override
    public String toString() {
        return "Atendimento\n" +
                "Cliente = " + cliente +
                "\nValor Base = " + valorBase +
                "\nValor final = " + calculaValor() +
                "\nstatus = " + status.getCodigo() +
                " " + status.getDescricao();
    }

    public abstract double calculaValor();

    public void alteraStatus(StatusAtendimento status){
        this.status = status;
    }

}
