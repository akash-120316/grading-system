
import java.util.Scanner;

public class grade {

    public static void main(String[] args) {
        String grade;
        Scanner sc = new Scanner(System.in);
        int mark = sc.nextInt();
        if (mark >= 90 && mark <= 100) {
            grade = "A";
        } else if (mark < 90 && mark >= 80) {
            grade = "B";
        } else if (mark < 80 && mark >= 70) {
            grade = "C";
        } else if (mark < 70 && mark >= 60) {
            grade = "D";
        } else if (mark > 100 || mark < 0) {
            grade = "enter valid marks";
        } else {
            grade = "F";
        }
        System.out.println(grade);
    }
}
