package Exercícios.chatGPT.dominio2;

public class Pedido1 {
    protected String nome;
    protected double valor;
    public StatusPedido1 statusPedido = StatusPedido1.CRIADO;

    public Pedido1(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Pedido " +
                "\nNome = " + nome +
                "\nValor = " + valor +
                "\nStatus Pedido = " + verificaStatus();
    }

    public String verificaStatus(){
        return statusPedido.verificaStatus();
    }

    public void alteraStatus(StatusPedido1 statusPedido){
        this.statusPedido = statusPedido;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
