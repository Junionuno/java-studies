package Exercícios.chatGPT.dominio3;

public class CaminhaoBau extends Transporte{
    @Override
    public void carregar(double peso) throws ExcessoDeCargaException {
        if (peso > 10000){
            throw new ExcessoDeCargaException("Peso de " + peso + "kg excede o limite do baú!");
        }
        System.out.println("Caminhão carregado com sucesso.");
    }
}
