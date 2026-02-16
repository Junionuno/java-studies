package Exercícios.chatGPT.dominio3;

public class DivisaoPorZeroException extends Exception{
    public DivisaoPorZeroException() {
    }

    public DivisaoPorZeroException(String message) {
        super(message);
    }
}
