package Exercícios.chatGPT.test;


import java.time.LocalDate;
import java.time.Period;


public class Exercicio41 {
    public static void main(String[] args) {
        String dataInicioStr = "2023-01-10";
        LocalDate hoje = LocalDate.now();

        LocalDate dataInicio = LocalDate.parse(dataInicioStr);
        Period tempo = Period.between(dataInicio, hoje);
        System.out.printf("%d anos, %d meses, %d dias.%n", tempo.getYears(), tempo.getMonths(), tempo.getDays());

        Period periodoRenovacao = Period.of(3, 6, 20);
        LocalDate dataRenovacao = dataInicio.plus(periodoRenovacao);
        System.out.println("Data de renovação: " + dataRenovacao);

        if (tempo.getYears() >= 2){
            System.out.println("Jogador veterano - Ganha bônus de liderança");
        }else{
            System.out.println("Jogador novo - Em fase de adaptação.");
        }
    }
}
