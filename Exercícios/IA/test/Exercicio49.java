package Exercícios.IA.test;

import Exercícios.IA.dominio4.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class ModelComparator implements Comparator<Car>{
    @Override
    public int compare(Car car1, Car car2) {
        return car1.getModel().compareTo(car2.getModel());
    }
}

public class Exercicio49 {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        Car car1 = new Car("Vectra", "Geraldo", 80);
        Car car2 = new Car("Onix", "Silva", 95);
        Car car3 = new Car("Astra", "Carlos", 110);

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);

        for(Car car : cars){
            System.out.println(car.getModel() + ": " + car.getPilot());
        }

        Car car4 = new Car("Cruze", "Pedro", 50);
        cars.add(0, car4);
        //cars.remove(car2);

        System.out.println("------------------------");
        for(Car car : cars){
            System.out.println(car.getModel() + ": " + car.getPilot());
        }

        System.out.println("------------Pontos----------------");
        Collections.sort(cars);
        for(Car car : cars){
            System.out.println(car.getModel() + ": " + car.getPilot());
        }

        System.out.println("-----------Modelo-------------");
        cars.sort(new ModelComparator());
        for(Car car : cars){
            System.out.println(car.getModel() + ": " + car.getPilot());
        }
    }
}
