package Exercícios.chatGPT.dominio3;

public class ExcessoDeCargaException extends Exception{
    public ExcessoDeCargaException() {
    }

    public ExcessoDeCargaException(String message) {
        super(message);
    }
}
