package Exercícios.chatGPT.test;

import Exercícios.chatGPT.dominio3.Ingresso;
import Exercícios.chatGPT.dominio3.Inteira;
import Exercícios.chatGPT.dominio3.MeiaEntrada;
import Exercícios.chatGPT.dominio3.ValidarPortaria;

public class exercicio27 {
    public static void main(String[] args) {
        Ingresso[] ingressos = new Ingresso[3];

        Ingresso ingresso1 = new Inteira(100, "Brahma Sul", 30);
        ingressos[0] = ingresso1;

        Ingresso ingresso2 = new MeiaEntrada(50, "Brahma sul", 18);
        ingressos[1] = ingresso2;

        Ingresso ingresso3 = new MeiaEntrada(50, "Brahma sul", 40);
        ingressos[2] = ingresso3;

        for (Ingresso ingresso : ingressos){
            try {
                ValidarPortaria.validarEntrada(ingresso, ingresso.getIdade());
                System.out.println("Ingresso comprado corretamente! " + ingresso.getIdade());
            }catch (IllegalArgumentException e){
                e.printStackTrace();
            }
        }

        System.out.println("Sejam Bem-vindos a Arena do GALO!");
    }
}
