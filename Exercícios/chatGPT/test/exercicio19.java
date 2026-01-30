package Exercícios.chatGPT.test;

import Exercícios.chatGPT.dominio2.Notificacao;
import Exercícios.chatGPT.dominio2.NotificacaoEmail;
import Exercícios.chatGPT.dominio2.NotificacaoSMS;

public class exercicio19 {
    public static void main(String[] args) {
        Notificacao notificacaoEmail = new NotificacaoEmail();
        Notificacao notificacaoSMS = new NotificacaoSMS();

        notificacaoSMS.enviaNotificacao();
        notificacaoEmail.enviaNotificacao();
    }
}
