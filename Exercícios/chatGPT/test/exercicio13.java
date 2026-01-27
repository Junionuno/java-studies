package Exercícios.chatGPT.test;

import Exercícios.chatGPT.dominio.Aluno1;
import Exercícios.chatGPT.dominio.Curso;
import Exercícios.chatGPT.dominio.CursoOnline;

public class exercicio13 {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setNome("ADS");
        curso.setValorBase(400);
        System.out.println(curso);

        System.out.println("-----------------");
        Curso curso1 = new Curso();
        curso1.setNome("Engenharia de Software");
        curso1.setValorBase(1000);
        System.out.println(curso1);

        System.out.println("------------------");
        Curso curso2 = new CursoOnline();
        curso2.setNome("ADS EAD");
        curso2.setValorBase(350);
        System.out.println(curso2);

        System.out.println("--------------------");
        Aluno1 aluno = new Aluno1("Arthur");
        aluno.setCurso(curso2);
        System.out.println(aluno);
    }
}
