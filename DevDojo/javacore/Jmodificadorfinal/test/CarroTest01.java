package DevDojo.javacore.Jmodificadorfinal.test;

import DevDojo.javacore.Jmodificadorfinal.dominio.Carro;
import DevDojo.javacore.Jmodificadorfinal.dominio.Comprador;
import DevDojo.javacore.Jmodificadorfinal.dominio.Ferrari;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Comprador comprador2 = new Comprador();


        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);

        carro.COMPRADOR.setNome("Geraldo");
        System.out.println(carro.COMPRADOR);

        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Enzo");
        ferrari.imprime();

    }
}
