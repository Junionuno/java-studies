package DevDojo.javacore.Gassociacao.test;

import DevDojo.javacore.Gassociacao.dominio.Jogador;
import DevDojo.javacore.Gassociacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Time time = new Time("Seleção brasileira");

        jogador1.setTime(time);

        jogador1.imprime();
    }
}
