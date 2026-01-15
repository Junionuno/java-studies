package DevDojo.javacore.Eblocosinicializacao.test;

import DevDojo.javacore.Eblocosinicializacao.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("One Piece");

        for(int episodios:anime.getEpisodios()){
            System.out.print(episodios + " ");
        }
    }
}
