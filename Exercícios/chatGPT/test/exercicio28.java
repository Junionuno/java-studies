package Exercícios.chatGPT.test;

import java.io.IOException;

public class exercicio28 {
    public static void main(String[] args) {
        try{
            salvarRelatorio();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            System.out.println("Fechando conexão com o banco de dados e liberando memória.");
        }
    }

    private static void salvarRelatorio() throws IOException {
        System.out.println("Abrindo arquivo de relatório...");
        throw new IOException("Falha de disco");
    }
}
