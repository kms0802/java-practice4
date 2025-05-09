import java.util.Scanner;

public class Switch_grade {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        String grade = "";
        int num_grade = scanner.nextInt();
        int sw_grade = num_grade / 10;

        switch (sw_grade) {
            case 10:
            case 9 :
                grade = "A";
                System.out.println("학점은" + grade + "입니다.");
                break;
            case 8:
                grade = "B";
                System.out.println("학점은" + grade + "입니다.");
                break;
            case 7:
                grade = "C";
                System.out.println("학점은" + grade + "입니다.");
                break;
            case 6:
                grade = "D";
                System.out.println("학점은" + grade + "입니다.");
                break;
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
                grade = "F";
                System.out.println("학접은" + "grade" + "입니다.");
            default :
                System.out.println("정상적인 값이 아님."); 
        }
    }
}
