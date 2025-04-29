import java.util.Scanner;

public class Practice_9_1 {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력: ");
        int num1 = scanner.nextInt();

        if(num1 >= 1 && num1 <= 100) {
            System.out.println("출력: 1에서 100사이의 값입니다.");
        } else {
            System.out.println("출력: 1에서 100 사이의 값이 아닙니다.");
        }
    }
}
