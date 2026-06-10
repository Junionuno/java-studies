package DevDojo.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>();

        mangas.add("Berserk");
        mangas.add("Hellsing Ultimate");
        mangas.add("Attack on Titan");
        mangas.add("Pokeomn");
        mangas.add("Dragon Ball Z");
        for (String manga : mangas){
            System.out.println(manga);
        }

        Collections.sort(mangas);

        for (String manga : mangas){
            System.out.println(manga);
        }

    }
}
