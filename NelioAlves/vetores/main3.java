package NelioAlves.vetores;

public class main3 {
    public static void main(String[] args) {
        String[] vect = new String[]{"Maria", "Carlos", "João"};

        for (int i = 0; i< vect.length; i++){
            System.out.println(vect[i]);
        }

        System.out.println("-----------------");

        for(String obj : vect){
            System.out.println(obj);
        }
    }
}
