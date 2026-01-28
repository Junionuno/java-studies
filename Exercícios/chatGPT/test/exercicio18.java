package Exercícios.chatGPT.test;

import Exercícios.chatGPT.dominio2.Atendimento;
import Exercícios.chatGPT.dominio2.AtendimentoOnline;
import Exercícios.chatGPT.dominio2.AtendimentoPresencial;
import Exercícios.chatGPT.dominio2.StatusAtendimento;

public class exercicio18 {
    public static void main(String[] args) {
        Atendimento atendimento = new AtendimentoOnline("Geraldo", 150);
        Atendimento atendimento1 = new AtendimentoPresencial("João", 150);

        atendimento.alteraStatus(StatusAtendimento.EM_ANDAMENTO);
        atendimento1.alteraStatus(StatusAtendimento.CANCELADO);

        System.out.println(atendimento);
        System.out.println("------------------------------------");
        System.out.println(atendimento1);
        System.out.println("------------------------------------");
        System.out.println(atendimento);
    }
}
