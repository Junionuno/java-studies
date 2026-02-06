package Exercícios.chatGPT.dominio3;

public class Bicicleta extends Veiculo {
    protected int numeroMarchas;

    public Bicicleta(String modelo, double valorMercado, int numeroMarchas) {
        super(modelo, valorMercado);
        this.numeroMarchas = numeroMarchas;
    }

    @Override
    public void exibirDados() {
        System.out.printf("Modelo: %s%nValor de mercado: %.2f%nNúmero de marchas: %d%n%n", modelo, valorMercado, numeroMarchas);
    }
}
