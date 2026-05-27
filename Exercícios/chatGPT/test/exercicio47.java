package Exercícios.chatGPT.test;

import Exercícios.chatGPT.dominio3.Exercise;

import java.util.ArrayList;
import java.util.List;

public class exercicio47 {
    public static void main(String[] args) {
        List<Exercise> exerciseList = new ArrayList<>();
        Exercise exercise1 = new Exercise("Supino Declinado", 3);
        Exercise exercise2 = new Exercise("Supino Inclinado", 3);
        Exercise exercise3 = new Exercise("Desenvolvimento", 3);

        exerciseList.add(exercise1);
        exerciseList.add(exercise2);
        exerciseList.add(exercise3);

        Exercise exercise4 = new Exercise("Supino reto", 3);
        System.out.println(exerciseList.contains(exercise4));
        if (!exerciseList.contains(exercise4)){
            exerciseList.add(exercise4);
        }

        System.out.println(exerciseList);
    }
}
