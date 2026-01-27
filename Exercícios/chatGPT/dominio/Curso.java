package Exercícios.chatGPT.dominio;

public class Curso {
    private String nome;
    private double valorBase;
    public static final double TAX = 0.10;

    @Override
    public String toString() {
        return "nome = " + nome + " valor total = " + valorTotal();
    }

    public double valorTotal(){
        return valorBase + valorBase * TAX;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorBase() {
        return valorBase;
    }

    public void setValorBase(double valorBase) {
        this.valorBase = valorBase;
    }
}
