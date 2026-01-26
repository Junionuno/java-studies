package Exercícios.chatGPT.dominio;

public class Pedido {
    private String cliente;
    private double valorBase;
    public static final double TAXA_SERVICO = 0.10;

    public double calcularTotal(){
        return valorBase + (valorBase * TAXA_SERVICO);
    }

    @Override
    public String toString() {
        return "Cliente= " + cliente + ", valor final=" + calcularTotal() +
                ", TAXA_SERVICO = 10%";
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getValorBase() {
        return valorBase;
    }

    public void setValorBase(double valorBase) {
        this.valorBase = valorBase;
    }
}
