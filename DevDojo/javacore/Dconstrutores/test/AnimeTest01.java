package DevDojo.javacore.Dconstrutores.test;

import DevDojo.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Naruto", "TV", 500, "Shonen");

        Anime anime2 = new Anime("Dragon ball Z", "TV", 291, "Ação", "Toei Animation");

        anime.imprime();
        anime2.imprime();
    }
}
