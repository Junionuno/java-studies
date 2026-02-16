package Exercícios.chatGPT.dominio3;

public class Calculadora {
    protected double a;
    protected double b;

    public Calculadora(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double soma(){
        return a + b;
    }

    public double subtrai(){
        return a - b;
    }

    public double multiplica(){
        return a * b;
    }

    public double divide() throws DivisaoPorZeroException{
        if (b == 0){
            throw new DivisaoPorZeroException("Divisão por zero indisponível.");
        }
        return a / b;
    }
}
