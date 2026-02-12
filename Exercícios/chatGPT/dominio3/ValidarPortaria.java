package Exercícios.chatGPT.dominio3;

public class ValidarPortaria{
    public static void validarEntrada(Ingresso i, int idade) {
        if (i instanceof MeiaEntrada && idade > 21){
            throw new IllegalArgumentException("Atenção: Este ingresso de Meia-Entrada é inválido para torcedores acima de 21 anos!");
        }
    }
}
