package NelioAlves.repetitivas;

public class ExercicioGPT3 {
    public static void main(String[] args) {
        /*int n = 10;
        int soma = 0;

        for (int i=0; i<=n; i++){
            if (i % 2 == 0){
                soma = soma + i;
            }
        }
        System.out.println("Soma dos pares = "+soma);*/

        int n = 5;
        int fat = 1;

        for (int i= 1; i<=n; i++){
            fat = fat * i;
        }
        System.out.println(n +"! = "+ fat);
    }
}
