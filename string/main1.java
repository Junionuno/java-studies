package string;

public class main1 {
    public static void main(String[] args) {
        String name = "Geraldo Junio Candido Neto";

        String[] vect = name.split(" ");
        String firstName = vect[0];
        String secondName = vect[1];

        System.out.println(vect[0]);
        System.out.println(firstName);
        System.out.println(secondName);

    }
}
