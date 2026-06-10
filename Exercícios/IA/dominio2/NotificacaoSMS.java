package Exercícios.IA.dominio2;

public class NotificacaoSMS implements Notificacao{
    @Override
    public void enviaNotificacao() {
        System.out.println("Você recebeu um SMS!");
    }
}
