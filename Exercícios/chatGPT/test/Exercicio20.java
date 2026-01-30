package Exercícios.chatGPT.test;

import Exercícios.chatGPT.dominio2.Entrega;
import Exercícios.chatGPT.dominio2.EntregaComum;
import Exercícios.chatGPT.dominio2.EntregaExpressa;
import Exercícios.chatGPT.dominio2.StatusEntrega;

public class Exercicio20 {
    public static void main(String[] args) {
        Entrega entrega = new EntregaComum("Junio", 50);
        Entrega entrega1 = new EntregaExpressa("Neto", 50);

        System.out.println(entrega);
        System.out.println(entrega1);
        System.out.println("---------------------");

        entrega.alteraStatus(StatusEntrega.EM_TRANSPORTE);
        entrega1.alteraStatus(StatusEntrega.EM_TRANSPORTE);
        System.out.println(entrega);
        System.out.println(entrega1);
    }
}
