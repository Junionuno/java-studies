package Exercícios.chatGPT.dominio;

public class PedidoOnline extends Pedido{
    public final double DESCONTOONLINE = 10;

    public double descontoOnline() {
        return calcularTotal() - DESCONTOONLINE;
    }

    @Override
    public String toString() {
        return  "Cliente = " + getCliente() +  ", Valor final = " + descontoOnline() +
                ", DESCONTO ONLINE = " + DESCONTOONLINE;
    }
}
