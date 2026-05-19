package Exercícios.chatGPT.test;

import Exercícios.chatGPT.dominio3.Aluno;

public class exercicio46 {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Geraldo", "MAT-999", "Plano Gold");
        Aluno aluno2 = new Aluno("Geraldo Silva", "MAT-999", "Plano Gold");

        System.out.println(aluno1.hashCode());
        System.out.println(aluno2.hashCode());

        System.out.println("O hashcode é o mesmo? " + (aluno1.hashCode() == aluno2.hashCode()));
    }
}
