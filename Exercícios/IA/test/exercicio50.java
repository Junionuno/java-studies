package Exercícios.IA.test;

import Exercícios.IA.dominio4.GymExercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class WeightComparator implements Comparator<GymExercise>{
    @Override
    public int compare(GymExercise e1, GymExercise e2) {
        return Integer.compare(e2.getWeight(), e1.getWeight());
    }
}
public class exercicio50 {
    public static void main(String[] args) {
        List<GymExercise> exercises = new ArrayList<>();

        exercises.add(new GymExercise("Supino", 30));
        exercises.add(new GymExercise("Supino Inclinado", 25));
        exercises.add(new GymExercise("Remada", 50));

        Collections.sort(exercises);
        for (GymExercise exercise : exercises) {
            System.out.println(exercise);
        }
        System.out.println("----------------------");

        exercises.sort(new WeightComparator());
        for (GymExercise exercise : exercises) {
            System.out.println(exercise);
        }

    }
}
