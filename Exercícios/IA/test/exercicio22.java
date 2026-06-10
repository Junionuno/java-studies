package Exercícios.IA.test;

import Exercícios.IA.dominio2.Pedido;
import Exercícios.IA.dominio2.StatusPedido;


public class exercicio22 {
    public static void main(String[] args) {
        Pedido pedido = new Pedido("Geraldo", 20);

        System.out.println(pedido);
        System.out.println("-------------------");

        pedido.alteraStatus(StatusPedido.CANCELADO);
        System.out.println(pedido);
    }

}
