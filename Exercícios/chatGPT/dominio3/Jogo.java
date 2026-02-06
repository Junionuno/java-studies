package Exercícios.chatGPT.dominio3;

public class Jogo extends ProdutoDigital implements Jogavel{
    private Categoria categoria;

    public Jogo(String nome, double preco, Categoria categoria) {
        super(nome, preco);
        this.categoria = categoria;
    }

    @Override
    public void iniciar() {
        System.out.println("Carregando o jogo " + this.nome + "...");
    }

    @Override
    public void pausar() {
        System.out.println("Jogo " + this.nome + " pausado" );
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Nome: " + this.nome + "\nPreço: " + this.preco + "\nCategoria: " + this.categoria);
    }

    public void salvarProgresso(){
        System.out.println("Salvando o progresso...");
    }
}
