package Exercícios.chatGPT.dominio;

public class Chamado {
    private String nome;
    private String descricao;
    private StatusChamado status = StatusChamado.ABERTO;

    @Override
    public String toString() {
        return "Chamado\n" +
                "nome = " + nome + ", descrição = " + descricao + ", status=" + status;
    }

    public void chamado(){
        this.status = StatusChamado.ABERTO;
    }

    public void setStatusInicial(StatusChamado status) {
        this.status = status;
    }

    public void alteraStatus(StatusChamado novoStatus){
        status = novoStatus;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public StatusChamado getStatus() {
        return status;
    }
}
