package Exercícios.chatGPT.dominio;

public class SystemConfig {
    private static String country = "BR";
    public static double TAX;
    public static String CURRENCY;

    static{
        if(country == "BR"){
            TAX = 0.20;
            CURRENCY = "BRL";
        }else{
            TAX = 0.15;
            CURRENCY = "USD";
        }
    }
}
