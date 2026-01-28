package DevDojo.javacore.Lclassesabstratas.test;

import DevDojo.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import DevDojo.javacore.Lclassesabstratas.dominio.Funcionario;
import DevDojo.javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Christiane", 10000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Juliano", 5000);

        System.out.println(gerente);
        System.out.println(desenvolvedor);

        desenvolvedor.imprime();
        gerente.imprime();
    }
}
