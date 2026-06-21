package Exercícios.IA.test;

import Exercícios.IA.dominio4.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercicio51 {
    public static void main(String[] args) {
        List<Component> stock = new ArrayList<>();

        stock.add(new Component("Fluído de arrefecimento", 13));
        stock.add(new Component("Lona de freio", 30));
        stock.add(new Component("Disco de freio", 82));
        stock.add(new Component("Amortecedor", 29));

        //Etapa 1 (O Erro Proposital): Antes de ordenar a lista, crie um objeto idêntico a uma das peças que você adicionou e tente fazer um Collections.binarySearch(stock, pecaCriada). Imprima o resultado. (Observe o comportamento caótico ou o índice errado que pode aparecer devido à falta de ordenação).//
        Component componentToSearch = new Component("Amortecedor", 29);

        System.out.println(Collections.binarySearch(stock, componentToSearch));

        //Etapa 2 (A Busca Correta): Agora, ordene a lista com Collections.sort(stock). Refaça a mesma busca binária da etapa anterior. Imprima o índice retornado e use o método stock.get(indice) para provar que o Java achou a peça certa.//
        Collections.sort(stock);

        for (Component component : stock) {
            System.out.println(component);
        }

        System.out.println(Collections.binarySearch(stock, componentToSearch));

        //Etapa 3 (O Caso Negativo): Crie um objeto de uma peça que NÃO existe no seu estoque (ex: "Turbina Roletada"). Execute a busca binária por ela e imprima o retorno negativo.//
        Component newComponent = new Component("Turbina", 3);
        System.out.println(Collections.binarySearch(stock, newComponent));

    }
}
