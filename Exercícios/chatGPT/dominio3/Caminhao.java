package Exercícios.chatGPT.dominio3;

public class Caminhao extends Veiculo implements Tributavel{
    private static final double tributo = 0.05;
    protected TipoCombustivel tipoCombustivel;

    public Caminhao(String modelo, double valorMercado, TipoCombustivel tipoCombustivel) {
        super(modelo, valorMercado);
        this.tipoCombustivel = tipoCombustivel;
    }

    @Override
    public void exibirDados() {
        System.out.printf("Modelo: %s%nValor de mercado: %.2f%nTipo de combustível: %s%n", modelo, valorMercado, tipoCombustivel);
    }

    @Override
    public double calculaImposto() {
        return this.valorMercado * tributo;
    }
}
