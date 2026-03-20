/*9 - Faça um algoritmo que calcule o IMC (Índice de Massa Corporal) de uma pessoa, leia o seu peso e sua altura e imprima na tela sua condição
de acordo com a tabela abaixo:

Fórmula do IMC = peso / (altura) ²

Tabela Condições IMC:

Abaixo de 18,5   | Abaixo do peso
Entre 18,6 e 24,9 | Peso ideal (parabéns)
Entre 25,0 e 29,9 | Levemente acima do peso
Entre 30,0 e 34,9 | Obesidade grau I
Entre 35,0 e 39,9 | Obesidade grau II (severa)
Maior ou igual a 40 | Obesidade grau III (mórbida)*/

package Exercícios.devMagro;

public class exercicio9 {
    public static void main(String[] args) {
        double height = 1.70;
        double weight = 90;
        double imc = weight / (Math.pow(height, 2));

        if (imc < 18.5){
            System.out.printf("Abaixo do peso! IMC: %.2f", imc);
        }else if (imc > 18.5 && imc <= 24.9){
            System.out.printf("Peso ideal: %.2f", imc);
        }else if (imc >= 25 && imc <= 29.9){
            System.out.printf("Levemente acima do peso: %.2f", imc);
        }else if (imc >= 30 && imc <= 34.9){
            System.out.printf("Obesidade grau I: %.2f", imc);
        } else if (imc >= 35 && imc <= 39.9 ) {
            System.out.printf("Obesidade grau II: %.2f", imc);
        }else {
            System.out.printf("Obesidade grau III: %.2f", imc);
        }

    }
}
