package sequenciais;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		int media = (a + b) / 2;
		
		System.out.println(media);
		
		double x = 10.91023;
		
		String nome = "Maria";
		int idade = 31;
		double renda = 2.100;
		
		System.out.printf("%.2f%n", x); //PRINTF serve para que formate o valor determinado na variável.
		
		Locale.setDefault(Locale.US); //LOCALE.SETDEFAULT serve para alterar o vírgula dos números decimais para ponto.
		
		System.out.printf("%.2f%n", x);
		
		System.out.println("Resultado = "+ x + " Metros");
		
		System.out.printf("Resultado = %.2f metros%n", x);
		
		System.out.printf("%s tem %d anos e ganha R$%.3f reais.%n", nome, idade, renda);
	}	

}
