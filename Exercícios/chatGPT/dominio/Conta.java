package Exercícios.chatGPT.dominio;

public class Conta {
    protected String titular;
    protected double saldo;

    public Conta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public double depositar(double amount){
        return saldo += amount;
    }

    public double sacar(double amount){
        return saldo -= amount;
    }

    public double calcularSaldo(){
        return saldo;
    }

    public String toString(){
        return "Titular: " + getTitular() + "\nSaldo: " + calcularSaldo();
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
