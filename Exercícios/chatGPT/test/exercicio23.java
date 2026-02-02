package Exercícios.chatGPT.test;

import Exercícios.chatGPT.dominio2.Pedido1;
import Exercícios.chatGPT.dominio2.StatusPedido1;

public class exercicio23 {
    public static void main(String[] args) {
        Pedido1 pedido1 = new Pedido1("Geraldo", 30);

        System.out.println(pedido1);
        System.out.println(pedido1.verificaStatus());
        System.out.println("-------------");

        pedido1.alteraStatus(StatusPedido1.ENTREGUE);
        System.out.println(pedido1);
        System.out.println(pedido1.verificaStatus());
        System.out.println("--------------------");
    }
}
