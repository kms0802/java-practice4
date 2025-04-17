package No_Think_Run.Day_7.missions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Day_7_mission_2 {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("정수 1 : ");
            int num1 = scanner.nextInt();
            System.out.println("정수 2 : ");
            int num2 = scanner.nextInt();
            
            int result = num1 / num2;
            System.out.println("결과" + result);
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다." + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("숫자로만 입력하세요.");
        } catch (Exception e) {
            System.out.println("알 수 없는 예외가 발생했습니다.");
        } finally {
            scanner.close();
            System.out.println("프로그램 종료");
        }
    }
}
