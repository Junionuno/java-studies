package NelioAlves.entities;

public class BankAccount {
    private int numberAc;
    private String name;
    private double value;

    public BankAccount(int numberAc, String name, double initialDeposit) {
        this.name = name;
        this.numberAc = numberAc;
        deposit(initialDeposit);
    }

    public BankAccount(int numberAc, String name){
        this.numberAc = numberAc;
        this.name = name;
    }

    public int getNumberAc(){
        return numberAc;
    }

    public String getName(){
        return name;
    }

    public double getValue(){
        return value;
    }

    public void deposit(double value){
        this.value += value;
    }

    public void withdraw(double value){
        this.value = this.value - value - 5;
    }

    public String toString(){
        return "Account " + numberAc +
                ", Holder: " + name +
                ", Balance: " + String.format("%.2f", value);
    }
}
