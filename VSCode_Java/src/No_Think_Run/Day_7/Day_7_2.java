package No_Think_Run.Day_7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Day_7_2 {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("첫 번째 숫자: ");
            int num1 = scanner.nextInt();

            System.out.println("두 번째 숫자: ");
            int num2 = scanner.nextInt();

            double result = (double) num1 / num2;
            System.out.println("결과 값: " + result);
        } catch (ArithmeticException e) {
            System.out.println("예외 발생: 0으로 나눌 수 없습니다.");
        } catch (InputMismatchException e) {
            System.out.println("입력 형식 오류: 점수를 입력하세요");
        } finally {
            System.out.println("프로그램 종료");
            scanner.close();
        }
    }
}
