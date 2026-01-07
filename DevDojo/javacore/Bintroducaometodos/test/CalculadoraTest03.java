package DevDojo.javacore.Bintroducaometodos.test;

import DevDojo.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        double result = calc.divideDoisNumeros(20,2);
        System.out.println(result);
    }
}
