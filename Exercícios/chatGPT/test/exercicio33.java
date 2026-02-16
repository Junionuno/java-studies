package Exercícios.chatGPT.test;

import Exercícios.chatGPT.dominio3.PecaDefeituosaException;
import Exercícios.chatGPT.dominio3.SensorQualidade;
import Exercícios.chatGPT.dominio3.Validavel;

public class exercicio33 {
    public static void main(String[] args) {
        Validavel[] validaveis = new Validavel[3];

        SensorQualidade peca1 = new SensorQualidade("Barra");
        SensorQualidade peca2 = new SensorQualidade("Barra 2");
        SensorQualidade peca3 = new SensorQualidade("Barra 3");
        validaveis[0] = peca1;
        validaveis[1] = peca2;
        validaveis[2] = peca3;


        double[] medidas = {99, 43, 69};

        for (int i = 0; i < validaveis.length; i++) {
            try {
                validaveis[i].recebeLargura(medidas[i]);
            } catch (PecaDefeituosaException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }
}
