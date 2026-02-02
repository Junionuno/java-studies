package Exercícios.chatGPT.dominio2;

public class Pedido {
    protected String nome;
    protected double valor;
    protected StatusPedido statusPedido = StatusPedido.CRIADO;

    public Pedido(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String verificaStatus() {
        return switch (statusPedido) {
            case CRIADO -> "Pedido criado, aguardando pagamento!";
            case PAGO -> "Pagamento confirmado!";
            case ENVIADO -> "Pedido enviado para transporte!";
            case ENTREGUE -> "Pedido entregue ao cliente!";
            case CANCELADO -> "Pedindo cancelado!";
        };
    }

    public void alteraStatus(StatusPedido statusPedido){
        this.statusPedido = statusPedido;
    }

    @Override
    public String toString() {
        return "Pedido" +
                "\nnome = " + nome +
                "\nValor = " + valor +
                "\nStatus Pedido = " + statusPedido + " " + verificaStatus();
    }
}
