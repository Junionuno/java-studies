package NelioAlves.entities;

public class Cilindro {
    public double raio;
    public double altura;

    public double volume(){
        return 3.14159*(Math.pow(raio, 2))*altura;
    }

    public double area(){
        return 2 * 3.14159 * raio * (raio + altura);
    }

    public void updateValue(double r, double a){
        this.raio = r;
        this.altura = a;
    }
}
