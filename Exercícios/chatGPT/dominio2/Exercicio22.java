package Exercícios.chatGPT.dominio2;

public class Exercicio22 {
    public static void main(String[] args) {
        Usuario1 usuario1 =new Usuario1("Geraldo", NivelAcesso1.ADMIN);

        System.out.println(usuario1);
        System.out.println("-----------------");

        Usuario1 usuario2 = new Usuario1("Junio", NivelAcesso1.GERENTE);
        System.out.println(usuario2);
    }
}
