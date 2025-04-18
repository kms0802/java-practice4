package No_Think_Run.Day_8.missions;

import java.util.Scanner;

public class Day_8_mission_1 {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수 입력");
        int num1 = scanner.nextInt();
       
        if (num1 >= 0 && num1 <= 100) {
            System.out.println("점수는 " + num1 + "점");
        } else {
            throw new IllegalArgumentException("점수는 0~100 사이어야합니다.");
        }
        scanner.close();
    }
}
