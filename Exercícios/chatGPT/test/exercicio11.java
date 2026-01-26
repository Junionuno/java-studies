package Exercícios.chatGPT.test;

import Exercícios.chatGPT.dominio.Pedido;
import Exercícios.chatGPT.dominio.PedidoOnline;

public class exercicio11 {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.setCliente("Junio");
        pedido.setValorBase(100);
        pedido.calcularTotal();
        System.out.println(pedido);

        System.out.println("-----------------");

        PedidoOnline pedido1 = new PedidoOnline();
        pedido1.setCliente("Neto");
        pedido1.setValorBase(100);
        pedido1.descontoOnline();
        System.out.println(pedido1);
    }
}
