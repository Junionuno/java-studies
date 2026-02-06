package Exercícios.chatGPT.test;

import Exercícios.chatGPT.dominio3.*;

public class exercicio25 {
    public static void main(String[] args) {
        Veiculo[] veiculos = new Veiculo[2];

        Veiculo caminhao1 = new Caminhao("Scania", 150000, TipoCombustivel.DIESEL);
        veiculos[0] = caminhao1;

        Veiculo bicicleta = new Bicicleta("Caloi", 500, 6);
        veiculos[1] = bicicleta;

        for(Veiculo veiculo : veiculos){
            veiculo.exibirDados();
            if (veiculo instanceof Tributavel){
                Tributavel objTributavel = (Tributavel) veiculo;
                System.out.println("Imposto a ser pago: " + objTributavel.calculaImposto());
                System.out.println();
            }

        }
    }
}
