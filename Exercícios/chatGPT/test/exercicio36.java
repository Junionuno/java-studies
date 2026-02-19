package Exercícios.chatGPT.test;

public class exercicio36 {
    public static void main(String[] args) {
        String name = "Vinicius de Oliveira";

        int space = name.indexOf(" ");
        String firstName = name.substring(0, space);
        System.out.println(firstName);

        StringBuilder sb = new StringBuilder();
        sb.append(firstName.charAt(0));
        sb.append("***");
        sb.append(firstName.charAt(firstName.length() - 1));

        System.out.println(sb);

        String username = name.replace(" ", "");
        username = username.toLowerCase();
        StringBuilder usernameSb = new StringBuilder(username);
        usernameSb.reverse();

        System.out.println(usernameSb);
    }
}
