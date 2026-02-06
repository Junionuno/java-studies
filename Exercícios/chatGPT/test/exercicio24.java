package Exercícios.chatGPT.test;

import Exercícios.chatGPT.dominio3.Categoria;
import Exercícios.chatGPT.dominio3.Dlc;
import Exercícios.chatGPT.dominio3.Jogo;
import Exercícios.chatGPT.dominio3.ProdutoDigital;

public class exercicio24 {
    public static void main(String[] args) {
        ProdutoDigital[] produto = new ProdutoDigital[2];

        ProdutoDigital batman = new Jogo("Batman", 150, Categoria.ACAO);
        produto[0] = batman;

        ProdutoDigital dlc = new Dlc("Red Hood Story Pack", 50, "Batman");
        produto[1] = dlc;


        for(ProdutoDigital produtos : produto){
            produtos.exibirDetalhes();
            if (produtos instanceof Jogo){
                Jogo jogo = (Jogo) produtos;
                jogo.iniciar();
                jogo.salvarProgresso();
            }
            System.out.println("=================================");
        }
    }
}
