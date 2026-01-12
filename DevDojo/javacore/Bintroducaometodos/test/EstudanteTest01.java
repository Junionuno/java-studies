package DevDojo.javacore.Bintroducaometodos.test;

import DevDojo.javacore.Bintroducaometodos.dominio.Estudante;
/*
import DevDojo.javacore.Bintroducaometodos.dominio.ImprimeEstudante;
*/

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        /*ImprimeEstudante imp = new ImprimeEstudante();*/

        estudante.idade = 15;
        estudante.nome = "Naruto";
        estudante.sexo = 'M';
        /*imp.imprime(estudante);*/

        estudante.imprime();
    }
}
