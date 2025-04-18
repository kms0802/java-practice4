package No_Think_Run.Day_7.missions;

import java.util.Scanner;

public class Day_7_mission_6 {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        try {
            String age = scanner.nextLine();
            int number = Integer.parseInt(age);
            System.out.println(age);
        } catch (NumberFormatException e) {
            System.out.println("값 오류" + e);
        } finally {
            scanner.close();
            System.out.println("프로그램 종료");
        }
    }
}
