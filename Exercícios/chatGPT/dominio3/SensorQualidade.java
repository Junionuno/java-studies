package Exercícios.chatGPT.dominio3;

public class SensorQualidade implements Validavel{
    protected String nome;

    @Override
    public void recebeLargura(double valor) throws PecaDefeituosaException {
        if (valor < 50 || valor > 100){
            throw new PecaDefeituosaException("Peça " + getNome() + " defeituosa.");
        }
        System.out.println("Peça com medidas corretas!");
    }

    public SensorQualidade(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
