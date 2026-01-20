package DevDojo.javacore.Gassociacao.test;

import DevDojo.javacore.Gassociacao.dominio.Escola;
import DevDojo.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Kakashi Sensei");
        Professor professor2 = new Professor("Zabuza");
        Professor[] professores = {professor1, professor2};
        Escola escola = new Escola("Konoha", professores);

        escola.imprime();
    }
}
