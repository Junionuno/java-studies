package Exercícios.IA.test;

import Exercícios.IA.dominio.Funcionario;
import Exercícios.IA.dominio.FuncionarioCLT;
import Exercícios.IA.dominio.FuncionarioPJ;

public class exercicio09 {
    public static void main(String[] args) {
        Funcionario func = new FuncionarioPJ("Geraldo", 3000);
        Funcionario func1 = new FuncionarioCLT("Junio", 3000);

        System.out.println(func.toString());
        System.out.println(func1.toString());
    }
}
