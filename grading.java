import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            String grade;
            int[] mark=new int[11];
            Scanner sc = new Scanner(System.in);
            mark[i] = sc.nextInt();
            if (mark[i] >= 90 && mark[i] <= 100) {
                grade = "A";
            } else if (mark[i] < 90 && mark[i] >= 80) {
                grade = "B";
            } else if (mark[i] < 80 && mark[i] >= 70) {
                grade = "C";
            } else if (mark[i] < 70 && mark[i] >= 60) {
                grade = "D";
            } else if (mark[i] > 100 || mark[i] < 0) {
                grade = "enter valid marks";
            } else {
                grade = "F";
            }
            System.out.println(grade);
        }
    }
}

