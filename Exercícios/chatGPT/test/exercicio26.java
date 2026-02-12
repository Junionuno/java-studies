package Exercícios.chatGPT.test;

public class exercicio26 {
    public static void main(String[] args) {
        try {
            dividir(1,0);
        }catch (ArithmeticException e){
            System.out.println("Erro: Não é possível dividir por zero, Galo! Verifique seus números.");
        }catch (RuntimeException e){
            e.printStackTrace();
        }
    }

    public static int dividir(int a, int b){
        if (b == 0){
            throw new ArithmeticException();
        }
        return a/b;
    }
}
