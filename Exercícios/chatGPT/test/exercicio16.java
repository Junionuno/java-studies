package Exercícios.chatGPT.test;

import Exercícios.chatGPT.dominio.Pedido1;
import Exercícios.chatGPT.dominio.StatusPedido1;

public class exercicio16 {
    public static void main(String[] args) {
        Pedido1 pedido = new Pedido1();
        pedido.setNome("João");
        pedido.setValor(150);

        System.out.println(pedido);

        System.out.println("-----------------");
        pedido.alteraStatus(StatusPedido1.PROCESSANDO);
        System.out.println(pedido);

        System.out.println("-----------------");
        pedido.alteraStatus(StatusPedido1.ENTREGUE);
        System.out.println(pedido);
    }
}
