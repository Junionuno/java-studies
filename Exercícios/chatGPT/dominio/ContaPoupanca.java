package Exercícios.chatGPT.dominio;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(String titular, double saldo) {
        super(titular, saldo);
    }

    @Override
    public double calcularSaldo() {
        return saldo = saldo + saldo * 0.02;
    }
}
