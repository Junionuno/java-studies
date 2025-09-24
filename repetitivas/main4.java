package repetitivas;

import java.util.Scanner;

public class main4 {
    public static void main(String[] args) {
        /*int x = 4;
        int y = x + 2;

        for(int i=0; i<x; i++){
            System.out.println(x+" "+y);
            y = y+i;*/

        /*for(int i = 1; i<5; i++){
            int y = i - 1;
            int x = i * 10;
            System.out.println(i);

            System.out.println(x +" "+y);
        }*/

        /*int y = 10;
        for(int i=0; i<4;i++){
            System.out.print(i);
            y = y + i;
            System.out.println(y);
        }*/

        /*int x = 4;
        int y = 0;

        for (int i=0; i<x; i++){
            System.out.print(i);
            System.out.println(x);
            y = y + 10;
        }*/

        /*int x = 4;
        int y = 0;
        for(int i = 0; i<x; i++){
            y = y + i;
        }
        System.out.println(y);*/

        int x = 8;
        int y = 3;

        for(int i=0; y<x; i++){
            x = x - 2;
            y = y + 1;
            System.out.println(i);
        }
    }
}
