package DevDojo.javacore.Bintroducaometodos.test;

import DevDojo.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest05 {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        int x = 10;
        int y = 16;

        calc.somaVarArgs(y, x);

    }
}
