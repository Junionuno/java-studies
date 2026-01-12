package DevDojo.javacore.Bintroducaometodos.test;

import DevDojo.javacore.Bintroducaometodos.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.sexo = 'F';
        estudante01.nome = "Sakura";
        estudante01.idade = 15;

        estudante01.imprime();
    }
}
