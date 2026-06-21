package Exercícios.IA.dominio4;

public class GymExercise implements Comparable<GymExercise>{
    private String name;
    private int weight;

    public GymExercise(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "GymExercise{" +
                "name = " + name +
                ", weight = " + weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public int compareTo(GymExercise otherExercise) {
        return this.name.compareTo(otherExercise.getName());
    }
}
