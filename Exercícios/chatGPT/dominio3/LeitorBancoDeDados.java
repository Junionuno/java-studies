package Exercícios.chatGPT.dominio3;

import java.io.Closeable;
import java.io.IOException;

public class LeitorBancoDeDados implements Closeable {
    @Override
    public void close() throws IOException {
        System.out.println("Conexão com o Banco de Dados fechada automaticamente.");
    }

    public void lerDados(){
        System.out.println("Lendo dados do banco...");
        throw new RuntimeException("Erro de conexão");
    }
}
