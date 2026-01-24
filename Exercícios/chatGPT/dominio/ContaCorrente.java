package Exercícios.chatGPT.dominio;

public class ContaCorrente extends Conta{
    public ContaCorrente(String titular, double saldo) {
        super(titular, saldo);
    }

    @Override
    public double sacar(double amount) {
        return saldo = saldo - amount - 5;
    }
}
