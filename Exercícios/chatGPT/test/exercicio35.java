package Exercícios.chatGPT.test;

public class exercicio35 {
    public static void main(String[] args) {
        String nomeCompleto = "   hulk paraiba   ";
        nomeCompleto = nomeCompleto.trim();
        nomeCompleto = nomeCompleto.toUpperCase();
        nomeCompleto = nomeCompleto.replace(" ", "_");

        StringBuilder sb = new StringBuilder(nomeCompleto);
        sb.reverse();
        System.out.println(sb);
    }
}
