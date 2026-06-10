package Exercícios.IA.dominio4;

import java.util.Objects;

public class Car {
    private String model;
    private String pilot;
    private int position;

    public Car(String model, String pilot) {
        this.model = model;
        this.pilot = pilot;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", pilot='" + pilot + '\'' +
                ", position=" + position +
                '}';
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

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
