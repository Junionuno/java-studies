package Exercícios.IA.test;

import Exercícios.IA.dominio2.Notificacao;
import Exercícios.IA.dominio2.NotificacaoEmail;
import Exercícios.IA.dominio2.NotificacaoSMS;

public class exercicio19 {
    public static void main(String[] args) {
        Notificacao notificacaoEmail = new NotificacaoEmail();
        Notificacao notificacaoSMS = new NotificacaoSMS();

        notificacaoSMS.enviaNotificacao();
        notificacaoEmail.enviaNotificacao();
    }
}
