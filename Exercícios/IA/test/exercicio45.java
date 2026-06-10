package Exercícios.IA.test;

import Exercícios.IA.dominio3.Car;

public class exercicio45 {
    public static void main(String[] args) {
        Car car1 = new Car("Vectra", "2.2");
        /*Car car2 = new Car("Vectra", "2.2");*/
        Car car3 = new Car("Vectra", "2.0");

        System.out.println("Hashcode do User 1: " + car1.hashCode());
        System.out.println("Hashcode do User 3: " + car3.hashCode());

        System.out.println("Os números são iguais? " + (car1.hashCode() == car3.hashCode()));
    }
}
