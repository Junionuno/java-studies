package Exercícios.IA.dominio4;

import java.util.Comparator;
import java.util.Objects;

public class Car implements Comparable<Car>{
    private String model;
    private String pilot;
    private int points;

    public Car(String model, String pilot, int points) {
        this.model = model;
        this.pilot = pilot;
        this.points = points;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", pilot='" + pilot + '\'' +
                ", points = " + points;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(model, car.model) && Objects.equals(pilot, car.pilot);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, pilot);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPilot() {
        return pilot;
    }

    public void setPilot(String pilot) {
        this.pilot = pilot;
    }

    @Override
    public int compareTo(Car outroCar) {
        return Integer.compare(outroCar.getPoints(), this.points);
    }
}
