package Exercícios.chatGPT.dominio3;

public class ItemLeilao {
    private String nome;
    private double valorMinimo;

    public ItemLeilao(String nome, double valorMinimo) {
        this.nome = nome;
        this.valorMinimo = valorMinimo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorMinimo() {
        return valorMinimo;
    }

    public void setValorMinimo(double valorMinimo) {
        this.valorMinimo = valorMinimo;
    }
}
