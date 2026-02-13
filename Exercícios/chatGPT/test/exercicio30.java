package Exercícios.chatGPT.test;

import Exercícios.chatGPT.dominio3.ConexaBackup;

import java.io.IOException;

public class exercicio30 {
    public static void main(String[] args) {
        try(ConexaBackup conexao = new ConexaBackup()) {
            conexao.fazerUpload("Teste");
            conexao.fazerUpload("");
        }catch (IOException e){
            System.out.println("Erro " + e.getMessage());
        }
    }
}
