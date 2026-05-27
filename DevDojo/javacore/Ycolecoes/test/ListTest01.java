package DevDojo.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        List<String> nomes2 = new ArrayList<>();
        nomes.add("William");
        nomes2.add("Suane");
        nomes.add("DevDojo");
        nomes2.add("Academy");

        nomes.addAll(nomes2);

        for(String nome : nomes){
            System.out.println(nome);
        }

        nomes.remove("William");
        System.out.println("---------------------");
        nomes.add("Suane");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }

        System.out.println("---------------------");
        System.out.println(nomes.get(1));

        List<String> nomes3 = new ArrayList<>(16);
        nomes3.add("William");
        nomes3.add("William");
        nomes3.add("DevDojo Academy");
        nomes3.remove("William");
        System.out.println(nomes3);
    }
}
