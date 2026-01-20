package DevDojo.javacore.Gassociacao.test;

import DevDojo.javacore.Gassociacao.dominio.Jogador;
import DevDojo.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Everson");
        Jogador jogador2 = new Jogador("Hulk");

        Jogador[] jogadores = {jogador1, jogador2};

        Time time = new Time("Atlético");

        jogador1.setTime(time);
        jogador2.setTime(time);

        time.setJogadores(jogadores);

        System.out.println("--- Jogador ---");
        jogador1.imprime();
        jogador2.imprime();

        System.out.println("--- Time ---");
        time.imprime();
    }
}
