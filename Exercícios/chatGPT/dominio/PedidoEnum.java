package Exercícios.chatGPT.dominio;

public class PedidoEnum {
    private String nome;
    private double valor;
    private StatusPedido status = StatusPedido.PENDENTE;

    @Override
    public String toString() {
        return "Pedido Criado" +
                "\nCliente: " + nome +
                "\nValor: " + valor +
                "\nStatus=" + status;
    }

    public void alteraStatus(StatusPedido novoStatus){
        this.status = novoStatus;
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

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }
}
