package Exercícios.chatGPT.dominio;

public enum StatusPedido1 {
    PENDENTE(1, "Aguardando Pagamento"),
    PROCESSANDO(2, "Pedido em separação"),
    ENTREGUE(3, "Pedido entregue ao cliente"),
    CANCELADO(4, "Pedido cancelado");

    private int valor;
    private String descricao;

    StatusPedido1(int valor, String descricao) {
        this.valor = valor;
        this.descricao = descricao;
    }

    public int getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }
}
