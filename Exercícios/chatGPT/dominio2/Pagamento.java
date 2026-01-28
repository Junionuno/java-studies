package Exercícios.chatGPT.dominio2;

public abstract class Pagamento {
    protected String nome;
    protected double valorBase;

    public Pagamento(String nome, double valorBase) {
        this.nome = nome;
        this.valorBase = valorBase;
    }

    public abstract double valorTotal();

    @Override
    public String toString() {
        return "Pagamento " +
                "nome = " + nome + '\'' +
                ", valorBase = " + valorTotal();
    }
}
