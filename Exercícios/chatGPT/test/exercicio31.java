package Exercícios.chatGPT.test;

import Exercícios.chatGPT.dominio3.CaminhaoBau;
import Exercícios.chatGPT.dominio3.ExcessoDeCargaException;

public class exercicio31 {
    public static void main(String[] args) {
        CaminhaoBau bau = new CaminhaoBau();

        try{
            bau.carregar(12000);
        }catch (ExcessoDeCargaException e){
            System.out.println("Alerta de Segurança: " + e.getMessage());
        }

        CaminhaoBau bau1 = new CaminhaoBau();

        try {
            bau1.carregar(6000);
        }catch (ExcessoDeCargaException e){
            System.out.println("Alerta de segurança " + e.getMessage());
        }
    }
}
