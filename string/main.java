package string;

public class main {
    public static void main(String[] args) {
        String original = "abcde FGHIJ ABC DEFG abc  ";

        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        String s03 = original.trim();
        String s04 = original.substring(2);
        String s05 = original.substring(2, 9);
        String s06 = original.replace('a', 'y');
        String s07 = original.replace("abc", "galo");
        int i = original.indexOf("bc");
        int j = original.lastIndexOf("bc");

        System.out.println("Original: - " + original + "-" );
        System.out.println("toLowerCase: - " + s01 + "-" );
        System.out.println("toUpperCase: - " + s02 + "-" );
        System.out.println("trim: - " + s03 + "-" );
        System.out.println("Substring (2): - " + s04 + "-" );
        System.out.println("Substring (2, 9): - " + s05 + "-" );
        System.out.println("replace (a, y): - " + s06 + "-" );
        System.out.println("replace (abc, galo): - " + s07 + "-" );
        System.out.println("indexOf (bc): - " + i + "-" ); // Sempre o primeiro caráctere da String
        System.out.println("lastIndexOf (bc): - " + j + "-"); // O último caracter "b" presente na String

    }
}
