package Exercícios.chatGPT.dominio3;

import java.util.Objects;

public class Car {
    private String model;
    private String engine;

    public Car(String model, String engine) {
        this.model = model;
        this.engine = engine;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) return false;
        if (this == obj) return true;
        Car car = (Car) obj;
        return model != null && model.equals(car.getModel()) && engine != null &&engine.equals(car.getEngine());
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, engine);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }
}
