package Exercícios.curso.test;

import Exercícios.curso.dominio.Funcionario;

public class funcionarioTest01 {
    public static void main(String[] args) {
        Funcionario func = new Funcionario();

        func.nome = "Geraldo";
        func.idade = 21;
        func.salarios = new double[]{2000.0, 3000.0, 3100.0};

        func.imprime();
        func.media();
    }
}
