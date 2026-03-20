package Exercícios.chatGPT.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class exercicio43 {
    public static void main(String[] args) {
        String regex = "[a-zA-Z]{3}-[0-9]{4}";
        String placa = "ABC-1234";

        System.out.println(placa.matches(regex));

        String regex1 = "[a-zA-Z]{3}[0-9][a-zA-Z][0-9]{2}";
        String placa1 = "JMU2H26";

        System.out.println(placa1.matches(regex1));

        String regexEmail = "^[\\w.-]+@[\\w.-]+\\.[a-z]{2,3}(\\.[a-z]{2})?$";
        String email = "contato.oficina@gmail.com.br";

        System.out.println(email.matches(regexEmail));

        String log = "ERRO: Usuario 'Geraldo' tentou acesso no IP 192.168.0.1 as 22:30";
        String regexLog = "\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}|\\d{2}:\\d{2}";
        Pattern pattern = Pattern.compile(regexLog);
        Matcher matcher = pattern.matcher(log);
        while(matcher.find()){
            System.out.println(matcher.group());
        }

        String cpfSujo = "123.456.789-00";
        String regexCPF = "\\D";
        String cpfLimpo = cpfSujo.replaceAll(regexCPF, "");
        System.out.println(cpfLimpo);

        String senha = "Galo2026";
        String regexSenha = "[A-Z]\\w{5}[0-9]{2}";
        System.out.println(senha.matches(regexSenha));
    }
}
