package No_Think_Run.Day_7.missions;

import java.util.*;

public class Day_7_mission_1 {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("정수 1: ");
        int num1 = scanner.nextInt();
        System.out.println("정수 2: ");
        int num2 = scanner.nextInt();

        try {
            double result = num1 / num2;
            System.out.println(result);

        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
        }

        System.out.println("시스템을 종료합니다.");
    }
}
