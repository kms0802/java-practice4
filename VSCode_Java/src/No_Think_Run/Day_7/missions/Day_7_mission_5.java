package No_Think_Run.Day_7.missions;

import java.util.Scanner;

public class Day_7_mission_5 {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);

        try {
            String age = scanner.nextLine();

            int number = Integer.parseInt(age);
            System.out.println(number);
        } catch (NumberFormatException e){
            System.out.println("숫자 형식이 아닙니다.");
        } finally {
            scanner.close();
        }
    }
}
