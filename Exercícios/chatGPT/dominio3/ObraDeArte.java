package Exercícios.chatGPT.dominio3;

public class ObraDeArte extends ItemLeilao implements Licitavel{
    public ObraDeArte(String nome, double valorMinimo) {
        super(nome, valorMinimo);
    }


    @Override
    public void receberLance(double valor) throws LanceInvalidoException {
        if (valor <= getValorMinimo()){
            throw new LanceInvalidoException("O lance deve ser maior que o valor mínimo para o item: " + getNome() + "!");
        }
        System.out.println("Lance de R$" + valor + " aceito para o item " + getNome());
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public double getValorMinimo() {
        return super.getValorMinimo();
    }

    @Override
    public void setValorMinimo(double valorMinimo) {
        super.setValorMinimo(valorMinimo);
    }
}
