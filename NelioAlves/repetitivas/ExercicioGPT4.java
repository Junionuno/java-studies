package NelioAlves.repetitivas;
import java.util.Scanner;

public class ExercicioGPT4 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Quantos alunos serão cadastrados? ");
    int alunos = sc.nextInt();

    String nome;
    int idade = 0, aprov =0, recup =0, reprov = 0;
    double nota1, nota2, nota3, media = 0, maiorM = 0, mediaG = 0, somaMedias = 0;

    for (int i = 1; i<=alunos; i++){
        System.out.println("Aluno "+ i+":");

        System.out.print("Nome: ");
        nome = sc.next();

        System.out.print("Idade: ");
        idade = sc.nextInt();

        System.out.print("Notas: ");
        nota1 = sc.nextDouble();
        nota2 = sc.nextDouble();
        nota3 = sc.nextDouble();

        media = (nota1 + nota2 + nota3) / 3;

        if(media >= 7){
            aprov = aprov + 1;
        }else if(media >= 5 && media <= 6.9){
            recup = recup + 1;
        }else {
            reprov = reprov + 1;
        }

        if (media > maiorM){
            maiorM = media;
        }

        somaMedias += media;
    }

    mediaG = somaMedias/alunos;

    System.out.println("Resumo da turma: ");
        System.out.printf("Aprovados: %d %nRecuperação: %d %nReprovados: %d %nMaior média: %.1f %nMédia geral da turma: %.1f", aprov, recup, reprov, maiorM, mediaG);

    sc.close();
    }
}
