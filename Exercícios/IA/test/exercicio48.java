package Exercícios.IA.test;

import Exercícios.IA.dominio3.Part;

import java.util.ArrayList;
import java.util.List;

public class exercicio48 {
    public static void main(String[] args) {
        List<Part> stock = new ArrayList<>();

        Part peca1 = new Part("Pinça", "Freio", 5);
        Part peca2 = new Part("Disco", "Freio", 5);
        Part peca3 = new Part("Pastilha", "Freio", 5);
        stock.add(peca1);
        stock.add(peca2);
        stock.add(peca3);

        for (Part pecas : stock){
            System.out.println("| Peça: " + pecas.getNome() + " | Categoria: " + pecas.getCategory() + " | Qtd: " + pecas.getQuantity() + " |");
        }

        Part peca4 = new Part("Pastilha", "Freio", 5);
        if (!stock.contains(peca4)){
            stock.add(peca4);
        }else if (stock.contains(peca4)){
            for (Part pecas : stock){
                if (peca4.hashCode() == pecas.hashCode()){
                    pecas.setQuantity(pecas.getQuantity() + peca4.getQuantity());
                }
            }
        }

        System.out.println("---------------------------------");

        for (Part pecas : stock){
            System.out.println("| Peça: " + pecas.getNome() + " | Categoria: " + pecas.getCategory() + " | Qtd: " + pecas.getQuantity() + " |");
        }
    }
}
