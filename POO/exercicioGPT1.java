package POO;

/*✅ Exercício Proposto (nível igual ao último do material)

Crie um programa que calcule o valor total de uma compra internacional, considerando:

- O valor em reais de um produto importado

- O percentual de imposto de importação

- O percentual de taxa alfandegária

Você deve:

1 - Criar uma classe chamada ImportCalculator

2 - Essa classe deve possuir membros estáticos e métodos para:

        - calcular o imposto de importação
        - calcular a taxa alfandegária
        - calcular o valor final a pagar

3 - No programa principal:

        - Ler o valor base do produto
        - Usar a classe para calcular o total
        - Exibir o resultado formatado*/

import util.ImportCalculator;

import java.util.Locale;
import java.util.Scanner;

public class exercicioGPT1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Product price: ");
        double price = sc.nextDouble();

        System.out.print("Import tax (%): ");
        double tax = sc.nextDouble();

        System.out.print("Customs fee (%): ");
        double fee = sc.nextDouble();

        double t = ImportCalculator.total(price, tax, fee);

        System.out.printf("Total to pay: %.2f", t);
        sc.close();
    }
}
