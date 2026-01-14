package DevDojo.javacore.Csobrecargametodos.test;

import DevDojo.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        anime.init("Naruto", "TV", 500, "Shonen");
        anime.imprime();
    }
}
