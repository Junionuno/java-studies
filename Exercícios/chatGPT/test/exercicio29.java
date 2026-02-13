package Exercícios.chatGPT.test;

import Exercícios.chatGPT.dominio3.LeitorBancoDeDados;

import java.io.IOException;

public class exercicio29 {
    public static void main(String[] args) {
        try(LeitorBancoDeDados leitor = new LeitorBancoDeDados()){
            leitor.lerDados();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
