package DevDojo.javacore.Ycolecoes.test;

import DevDojo.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangaByIdComparator implements Comparator<Manga>{
    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getId().compareTo(manga2.getId());
    }
}

class MangaByPriceComparator implements Comparator<Manga>{
    @Override
    public int compare(Manga manga1, Manga manga2) {
        if (manga1.getPreco() < manga2.getPreco()) {
            return -1;
        }else if (manga1.getPreco() == manga2.getPreco()){
            return 0;
        }
        return 1;
    }
}

public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();

        mangas.add(new Manga(5L, "Berserk", 23.9));
        mangas.add(new Manga(1L, "Hellsing Ultimate", 24.8));
        mangas.add(new Manga(4L,"Attack on Titan",10.9));
        mangas.add(new Manga(3L, "Pokemon", 3.2));
        mangas.add(new Manga(2L,"Dragon Ball Z", 11.2));

        for(Manga manga : mangas){
            System.out.println(manga);
        }
        System.out.println("-------------------------------");

        Collections.sort(mangas);

        for(Manga manga : mangas){
            System.out.println(manga);
        }

        System.out.println("-------------------------------");

        //Collections.sort(mangas, new MangaByIdComparator());
        mangas.sort(new MangaByIdComparator());
        for(Manga manga : mangas){
            System.out.println(manga);
        }

        System.out.println("-------------------------------");

        mangas.sort(new MangaByPriceComparator());
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

    }
}
