package Exercícios.chatGPT.dominio2;

public class NotificacaoEmail implements Notificacao{
    @Override
    public void enviaNotificacao() {
        System.out.println("Você recebeu um e-mail!");
    }
}
