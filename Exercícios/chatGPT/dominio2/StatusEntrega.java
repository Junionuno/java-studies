package Exercícios.chatGPT.dominio2;

public enum StatusEntrega {
    PENDENTE(1, "ENTREGA PENDENTE"),
    EM_TRANSPORTE(2, "ENTREGA EM ROTA"),
    ENTREGUE(3, "ENTREGUE"),
    CANCELADA(4, "CANCELADO");

    private int codigo;
    private String descricao;

    StatusEntrega(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }
}
