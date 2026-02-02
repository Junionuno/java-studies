package Exercícios.chatGPT.test;

import Exercícios.chatGPT.dominio2.Pedido;
import Exercícios.chatGPT.dominio2.StatusPedido;


public class exercicio22 {
    public static void main(String[] args) {
        Pedido pedido = new Pedido("Geraldo", 20);

        System.out.println(pedido);
        System.out.println("-------------------");

        pedido.alteraStatus(StatusPedido.CANCELADO);
        System.out.println(pedido);
    }

}
