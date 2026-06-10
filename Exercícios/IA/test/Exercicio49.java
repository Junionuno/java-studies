package Exercícios.IA.test;

import Exercícios.IA.dominio4.Car;

import java.util.ArrayList;
import java.util.List;

public class Exercicio49 {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        Car car1 = new Car("Vectra", "Geraldo");
        Car car2 = new Car("Onix", "Silva");
        Car car3 = new Car("Astra", "Carlos");

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);

        for(Car car : cars){
            System.out.println(car.getModel() + ": " + car.getPilot());
        }

        Car car4 = new Car("Cruze", "Pedro");
        cars.add(0, car4);
        cars.remove(car2);

        System.out.println("------------------------");
        for(Car car : cars){
            System.out.println(car.getModel() + ": " + car.getPilot());
        }
    }
}
