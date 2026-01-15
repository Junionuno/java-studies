package Exercícios.chatGPT.dominio;

public class ContaBancaria {
    private int count;
    private String name;
    private double value;

    public ContaBancaria(){
    }

    public ContaBancaria(int count, String name){
        this.count = count;
        this.name = name;
    }

    public ContaBancaria(int count, String name, double value){
        this(count, name);
        this.value = value;
    }

    public double deposit(double amount){
        return value += amount;
    }

    public double withDraw(double amount){
        return value -= amount;
    }

    public String toString(){
        return "Conta: " + this.count + "\nTitular: " + this.name + "\nSaldo: R$" + this.value;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
