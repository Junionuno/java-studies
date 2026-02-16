package Exercícios.chatGPT.test;

import Exercícios.chatGPT.dominio3.LanceInvalidoException;
import Exercícios.chatGPT.dominio3.Licitavel;
import Exercícios.chatGPT.dominio3.ObraDeArte;

public class exercicio32 {
    public static void main(String[] args) {
        Licitavel[] licitaveis = new Licitavel[2];

        ObraDeArte obra1 = new ObraDeArte("Monalisa", 20000);
        ObraDeArte obra2 = new ObraDeArte("Noite estrelada", 15000);

        licitaveis[0] = obra1;
        licitaveis[1] = obra2;

        double[] lancesDoDia = {21000, 14000};

        for(int i =0; i< licitaveis.length; i++){
            try{
                licitaveis[i].receberLance(lancesDoDia[i]);
            }catch (LanceInvalidoException e){
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }
}
