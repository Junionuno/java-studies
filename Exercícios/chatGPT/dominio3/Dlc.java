package Exercícios.chatGPT.dominio3;

public class Dlc extends ProdutoDigital{
    private String jogoPrincipal;

    public Dlc(String nome, double preco, String jogoPrincipal) {
        super(nome, preco);
        this.jogoPrincipal = jogoPrincipal;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("DLC " + this.nome + " do jogo " + this.jogoPrincipal);
    }
}
