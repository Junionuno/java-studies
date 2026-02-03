package Exercícios.curso.dominio;

public class Circulo implements AreaCalculavel{
    protected double raio;

    public Circulo(double raio){
        this.raio = raio;
    }

    @Override
    public double calculaArea() {
        return 3.14 * (Math.pow(raio, 2));
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}
