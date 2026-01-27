package Exercícios.chatGPT.test;

import Exercícios.chatGPT.dominio.PedidoEnum;
import Exercícios.chatGPT.dominio.StatusPedido;

import java.util.Scanner;

public class exercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PedidoEnum pedido = new PedidoEnum();
        pedido.setNome("Geraldo");
        pedido.setValor(35);
        pedido.setStatus(StatusPedido.PENDENTE);

        System.out.println(pedido);

        System.out.println("------------------");

        System.out.print("Digite o novo status: ");
        String value = sc.nextLine().toUpperCase();
        pedido.alteraStatus(StatusPedido.valueOf(value));
        System.out.println(pedido);

        sc.close();
    }
}
