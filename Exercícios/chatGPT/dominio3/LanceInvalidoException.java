package Exercícios.chatGPT.dominio3;

public class LanceInvalidoException extends RuntimeException{
    public LanceInvalidoException() {
    }

    public LanceInvalidoException(String message) {
        super(message);
    }
}
