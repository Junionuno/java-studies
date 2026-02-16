package Exercícios.chatGPT.dominio3;

public interface Licitavel {
    void receberLance(double valor) throws LanceInvalidoException;
}
