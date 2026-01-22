package Exercícios.curso.test;

import Exercícios.curso.dominio.Aluno;
import Exercícios.curso.dominio.Local;
import Exercícios.curso.dominio.Professor;
import Exercícios.curso.dominio.Seminario;

public class seminarioTest01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Geraldo", 21);
        Aluno aluno1 = new Aluno("Paulo", 22);
        Aluno[] alunos = {aluno, aluno1};

        Professor prof = new Professor("Girafales", "Fisica");

        Local local = new Local("Rua Kalama");

        Aluno aluno2 = new Aluno("Karinny", 22);
        Aluno aluno3 = new Aluno("Thayssa", 19);
        Aluno[] alunos1 = {aluno2, aluno3};

        Seminario sem = new Seminario("Física", local, alunos);
        Seminario sem1 = new Seminario("Matemática", local, alunos1);
        Seminario[] seminarios = {sem, sem1};

        aluno.setSeminario(sem);
        aluno1.setSeminario(sem);
        aluno2.setSeminario(sem1);
        aluno3.setSeminario(sem1);

        sem1.setProfessor(prof);
        sem.setProfessor(prof);

        prof.setSeminarios(seminarios);

        sem.imprime();
        System.out.println("-------------------");
        sem1.imprime();
    }
}
