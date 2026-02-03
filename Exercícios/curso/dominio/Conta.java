package Exercícios.curso.dominio;

public class Conta {
    protected double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double amount){
        this.saldo -= amount;
    }

    public void depositar(double amount){
        this.saldo += amount;
    }

    public double obterSaldo(){
        return this.saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
