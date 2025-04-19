package No_Think_Run.Day_9.missions;

import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;

public class Day_9_mission_2 {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        try {
            FileWriter writer = new FileWriter("memo.txt", true);
            System.out.print("추가할 내용:");
            String input = scanner.nextLine();
            writer.write(input);
            writer.close();
            System.out.println("내용이 추가되었습니다.");
        } catch (IOException e) {
            System.out.println("예외 발생: " + e.getMessage());
        }
    }
}
