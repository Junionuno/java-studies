package Exercícios.chatGPT.dominio3;

import java.io.IOException;

public class ConexaBackup implements AutoCloseable{
    @Override
    public void close() throws IOException {
        System.out.println("Conexão de backup encerrada.");
    }

    public void fazerUpload(String arquivo) throws IOException {
        if (arquivo == null || arquivo.trim().isEmpty()) {
            throw new IOException();
        }System.out.println(arquivo + " Criado.");
    }
}
