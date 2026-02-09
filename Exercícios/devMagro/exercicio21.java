/*21 - Faça um algoritmo que calcule a quantidade de litros de combustível gastos em uma viagem, sabendo que o carro faz 12km com um litro. Deve-se fornecer ao usuário o tempo que será gasto na viagem a sua velocidade média, distância percorrida e a quantidade de litros utilizados para fazer a viagem.
Fórmula: distância = tempo x velocidade.
        litros usados = distância / 12.*/

package Exercícios.devMagro;

import java.util.Scanner;

public class exercicio21 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Digite o tempo de viagem (em horas): ");
        double tempo = sc.nextDouble();

        System.out.println("Digite a velocidade média (km/h): ");
        double velocidade = sc.nextDouble();

        double distancia = tempo * velocidade;

        double litros = distancia / 12;

        System.out.printf("Tempo: %.1f horas Velocidade: %.2fkm/h Distância: %.2fkm Litros de combustível: %.2f", tempo, velocidade, distancia, litros);
    }
}
