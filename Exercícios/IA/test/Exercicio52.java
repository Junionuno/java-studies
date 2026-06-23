package Exercícios.IA.test;

import Exercícios.IA.dominio4.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercicio52 {
    public static void main(String[] args) {
        //Etapa 1 (O Array Inicial): Crie um array fixo de carros com 2 elementos://
        Car[] arrayantigo = { new Car("Vectra", "Geraldo", 90), new Car("Onix", "Silva", 95)};
        System.out.println(Arrays.toString(arrayantigo));
        System.out.println("------------------------------------");
        /*Etapa 2 (A Pegadinha do Arrays.asList): Crie uma lista utilizando o método Arrays.asList(arrayAntigo).

               - Tente usar o método .add() para inserir um terceiro carro: new Car("Cruze", "Pedro", 50).

               - Coloque essa linha dentro de um bloco try-catch capturando a exceção UnsupportedOperationException e imprima uma mensagem na tela como: "Deu erro! Arrays.asList gerou uma lista de tamanho fixo!".*/
        List<Car> lista = Arrays.asList(arrayantigo);

        try {
            lista.add(new Car("Cruze", "Pedro", 50));
        } catch (UnsupportedOperationException e) {
            System.out.println("Deu erro! Array.asList gerou uma lista de tamanho fixo.");;
        }
        System.out.println("------------------------------------");

        List<Car> listaCarros = new ArrayList<>(Arrays.asList(arrayantigo));
        System.out.println(listaCarros);
        listaCarros.add(new Car("Cruze", "Pedro", 50));
        listaCarros.get(0).setPilot("Geraldo modificado");
        System.out.println(listaCarros);

        System.out.println("------------------------------------");
        Car[] arrayCarros = listaCarros.toArray(new Car[0]);

        for (Car carro : arrayCarros) {
            System.out.println(carro);
        }
    }
}
