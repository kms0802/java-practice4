package No_Think_Run.Day_7.missions;

import java.util.Scanner;

public class Day_7_mission_7 {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);

        try {
            String check = scanner.nextLine();
            int check_num = scanner.nextInt();
    
            String result = .check.charAt(check_num);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("문자열 오류");
        } finally {
            System.out.println("종료");
            scanner.close();
        }
    }
}
