package Exercícios.chatGPT.dominio3;

public abstract class Veiculo {
    protected String modelo;
    protected double valorMercado;

    public Veiculo(String modelo, double valorMercado) {
        this.modelo = modelo;
        this.valorMercado = valorMercado;
    }

    public abstract void exibirDados();
}
