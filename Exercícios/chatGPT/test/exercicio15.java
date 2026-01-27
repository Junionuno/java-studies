package Exercícios.chatGPT.test;

import Exercícios.chatGPT.dominio.Chamado;
import Exercícios.chatGPT.dominio.ChamadoUrgente;
import Exercícios.chatGPT.dominio.StatusChamado;

public class exercicio15 {
    public static void main(String[] args) {
        Chamado chamado = new Chamado();
        chamado.setNome("Geraldo");
        chamado.setDescricao("Notebook sem bateria");

        Chamado chamado1 = new ChamadoUrgente();
        chamado1.setNome("Junio");
        chamado1.setDescricao("TOTVS caiu");

        System.out.println(chamado);
        System.out.println("----------------");
        System.out.println(chamado1);

        System.out.println("----------------");
        chamado.alteraStatus(StatusChamado.CANCELADO);
        System.out.println(chamado);
    }
}
