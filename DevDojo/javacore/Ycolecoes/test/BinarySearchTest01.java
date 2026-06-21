package DevDojo.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

        numeros.add(2);
        numeros.add(0);
        numeros.add(5);
        numeros.add(4);

        Collections.sort(numeros);
        for (Integer numero : numeros) {
            System.out.println(numero);
        }

        System.out.println("----------");

        System.out.println(Collections.binarySearch(numeros, 4));


    }
}
