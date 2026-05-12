package Exercícios.chatGPT.test;

import Exercícios.chatGPT.dominio3.Car;

public class exercicio45 {
    public static void main(String[] args) {
        Car car1 = new Car("Vectra", "2.2");
        Car car2 = new Car("Vectra", "2.2");
        Car car3 = new Car("Vectra", "2.0");

        System.out.println(car1.equals(car2));
        System.out.println(car2.equals(car3));
    }
}
