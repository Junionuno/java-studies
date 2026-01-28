package Exercícios.chatGPT.dominio2;

public enum StatusAtendimento {
    ABERTO(1, "Atendimento aberto."),
    EM_ANDAMENTO(2, "Atendimento em andamento."),
    FINALIZADO(3, "Atendimento finalizado."),
    CANCELADO(4, "Atendimento cancelado");

    private int codigo;
    private String descricao;

    StatusAtendimento(int codigo, String descricao) {
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
