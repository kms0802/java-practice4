package No_Think_Run.Day_7.missions;

import java.util.Scanner;

public class Day_7_mission_3 {
    public static void main(String[]args) {
       
        Scanner scanner = new Scanner(System.in);
        String name = null;

        try {
            System.out.print("이름 입력: ");
            name = scanner.nextLine();

            if (name.trim().isEmpty()) {
                name = null;
            }

            System.out.println("입력한 이름의 길이: " + name.length());
        } catch (NullPointerException e) {
            System.out.println("예외 발생: 이름이 입력되지 않았습니다.");
        } finally {
            System.out.println("프로그램 종료");
            scanner.close();
        }
    }
}
