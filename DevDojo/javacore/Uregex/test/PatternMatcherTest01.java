package DevDojo.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    public static void main(String[] args) {
        String answer = "geraldo12345";
        String regex = "(geraldo)";
        /*String text = "abaaba";*/
        /*String text2 = "abababa";*/
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(answer);
        System.out.println("texto:  " + answer);
        System.out.println("indice: 0123456789");
        System.out.println("regex: "+regex);
        System.out.println("Posições encontradas");
        while (matcher.find()){
            System.out.print(matcher.start() + " " + matcher.group());
        }
    }
}
