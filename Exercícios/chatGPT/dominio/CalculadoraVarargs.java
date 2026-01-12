package Exercícios.chatGPT.dominio;

public class CalculadoraVarargs {
    public void soma(int... num){
        System.out.println("SOMA:");
        int soma = 0;
        for(int i: num){
            soma += i;
        }
        System.out.println(soma);
    }

    public void media(double... num){
        System.out.println("MEDIA:");
        double soma = 0;
        double count = 0;
        for(double i: num){
            soma += i;
            count ++;
        }
        double res = soma / count;
        System.out.println(res);
    }

    public void maiorValor(int... num){
        System.out.println("MAIOR VALOR: ");
        int maior = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > maior){
                maior = num[i];
            }
        }
        System.out.println(maior);
    }

    public void concatenaString(String... words){
        System.out.println("CONCATENAÇÃO: ");
        String concatena = "";
        for (int i = 0; i < words.length; i++) {
            concatena += words[i] + " ";
        }

        System.out.println(concatena);
    }
}
