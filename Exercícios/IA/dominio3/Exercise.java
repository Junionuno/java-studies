package Exercícios.IA.dominio3;

import java.util.Objects;

public class Exercise {
    private String name;
    private int sets;

    public Exercise(String name, int sets) {
        this.name = name;
        this.sets = sets;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Exercise exercise = (Exercise) o;
        return name != null && name.equalsIgnoreCase(exercise.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Exercise{" +
                "name='" + name + '\'' +
                ", sets='" + sets + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSets() {
        return sets;
    }

    public void setSets(int sets) {
        this.sets = sets;
    }
}
