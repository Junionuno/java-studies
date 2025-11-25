package POO;
import entities.Student;
import java.util.Locale;
import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        student.name = sc.nextLine();

        student.grade1 = sc.nextDouble();
        student.grade2 = sc.nextDouble();
        student.grade3 = sc.nextDouble();

        System.out.println("FINAL GRADE = " + student.finalGrade());

        if(student.finalGrade() > 60){
            System.out.println("PASS");
        }else {
            System.out.printf("FAILED %nMISSING %.2f POINTS", student.missingPoints());
        }

        sc.close();
    }
}
