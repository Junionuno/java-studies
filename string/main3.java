package string;
import java.util.Scanner;

public class main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite três números: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("Maior: " + max(a, b, c));

        sc.close();
    }

    public static int max(int a, int b, int c){
        if(a > b && a > c){
            return a;
        }else if(b > c){
            return b;
        }else{
            return c;
        }
    }
}
