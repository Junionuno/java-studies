package Exercícios.chatGPT.dominio3;

public abstract class ProdutoDigital {
    protected String nome;
    protected double preco;

    public ProdutoDigital(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public abstract void exibirDetalhes();
}
