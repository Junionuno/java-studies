package Exercícios.chatGPT.dominio;

public class Pedido1 {
    private String nome;
    private double valor;
    private StatusPedido1 status = StatusPedido1.PENDENTE;

    @Override
    public String toString() {
        return "Pedido \n" +
                "nome = " + nome +
                "\nvalor = " + valor +
                "\nstatus = " + status +
                "\nCódigo do status: " + status.getValor() +
                "\nDescrição do status: " + status.getDescricao();
    }

    public void alteraStatus(StatusPedido1 status){
        this.status = status;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
