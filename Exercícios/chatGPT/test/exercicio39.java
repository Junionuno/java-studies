package Exercícios.chatGPT.test;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class exercicio39 {
    public static void main(String[] args) {
        LocalDateTime consulta = LocalDateTime.of(2026,12,25, 14, 30, 0);

        if(consulta.getHour() < 8 || consulta.getHour() > 18){
            System.out.println("Clínica fechada nesse horário!");
        }else if(consulta.getDayOfMonth() == 25 && consulta.getMonth() == Month.DECEMBER){
            System.out.println("Não atendemos em feriados!");
        }else{
            LocalDateTime dataRetorno = consulta.plusWeeks(2);
            System.out.println(dataRetorno);
        }
    }
}
