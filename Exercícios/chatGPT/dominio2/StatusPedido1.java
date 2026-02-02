package Exercícios.chatGPT.dominio2;

public enum StatusPedido1 {
    CRIADO(1, "Pedido criado."),
    PAGO(2, "Pedido pago."),
    ENVIADO(3,"Pedido enviado."),
    ENTREGUE(4, "Pedido entregue."),
    CANCELADO(5, "Pedido cancelado.");

    private int codigo;
    private String descricao;

    StatusPedido1(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String verificaStatus(){
        return getDescricao();
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }
}
