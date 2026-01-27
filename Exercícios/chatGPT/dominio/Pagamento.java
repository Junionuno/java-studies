package Exercícios.chatGPT.dominio;

public class Pagamento {
    private String nome;
    private double valorBase;
    public static final double TAXA = 0.02;

    @Override
    public String toString() {
        return "Pagamento " +
                "nome = " + nome + ", Valor Base= " + valorBase + " Valor completo: " + valorTotal();
    }

    public final double valorTotal(){
        return valorBase + valorBase * TAXA;
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
