package Exercícios.curso.test;

import Exercícios.curso.dominio.AreaCalculavel;
import Exercícios.curso.dominio.Circulo;
import Exercícios.curso.dominio.Quadrado;
import Exercícios.curso.dominio.Retangulo;

public class AreaCalculavelTest01 {
    public static void main(String[] args) {
        AreaCalculavel[] areas = new AreaCalculavel[5];

        areas[0] = new Quadrado(4);
        areas[1] = new Circulo(14);
        areas[2] = new Retangulo(19, 8);
        areas[3] = new Quadrado(11);
        areas[4] = new Retangulo(14, 27);

        for(AreaCalculavel area : areas){
            System.out.println("Área " + area.calculaArea());
        }
    }
}
