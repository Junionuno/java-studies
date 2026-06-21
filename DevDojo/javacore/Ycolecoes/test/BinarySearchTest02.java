package DevDojo.javacore.Ycolecoes.test;

import DevDojo.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();

        mangas.add(new Manga(5L, "Berserk", 23.9));
        mangas.add(new Manga(1L, "Hellsing Ultimate", 24.8));
        mangas.add(new Manga(4L,"Attack on Titan",10.9));
        mangas.add(new Manga(3L, "Pokemon", 3.2));
        mangas.add(new Manga(2L,"Dragon Ball Z", 11.2));

        Collections.sort(mangas);

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Manga MangaToSearch = new Manga(2L, "Dragon Ball Z", 2.99);

        System.out.println("---------------");
        System.out.println(Collections.binarySearch(mangas, MangaToSearch));

    }
}
