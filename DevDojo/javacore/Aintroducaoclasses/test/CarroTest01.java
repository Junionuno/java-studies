package DevDojo.javacore.Aintroducaoclasses.test;

import DevDojo.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro car1 = new Carro();
        Carro car2 = new Carro();

        car1.ano = 2021;
        car1.nome = "Onix";
        car1.modelo = "LT";

        car2.ano = 2000;
        car2.nome = "Vectra";
        car2.modelo = "Millenium";

        System.out.println("Carro 1 - Nome: " + car1.nome + " modelo: " + car1.modelo + " ano: " + car1.ano);
        System.out.println("Carro 2 - Nome: " + car2.nome + " modelo: " + car2.modelo + " ano: " + car2.ano);

    }
}
