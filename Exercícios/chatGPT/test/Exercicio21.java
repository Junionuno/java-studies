package Exercícios.chatGPT.test;

import Exercícios.chatGPT.dominio2.NivelAcesso;
import Exercícios.chatGPT.dominio2.Usuario;

public class Exercicio21 {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Geraldo", NivelAcesso.USUARIO);
        System.out.println(usuario);

        System.out.println("-------------------------");

        Usuario usuario1 = new Usuario("Neto", NivelAcesso.ADMIN);
        System.out.println(usuario1);
    }
}
