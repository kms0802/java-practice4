package No_Think_Run.Day_9.missions;

import java.util.Scanner;
import java.io.IOException;
import java.io.FileWriter;

public class Day_9_mission_1 {
    public static void main(String[]args) {
        
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("파일 내용 입력: ");
            String line;
            FileWriter writer = new FileWriter("memo.txt");
            
            for (int i = 1; i <= 3; i ++) {
                line = scanner.nextLine();
                writer.write(line + "\n");
            }
            writer.close();
            System.out.println("쓰기 종료");
            } catch (IOException e) {
                System.out.println("예외 처리: " + e.getMessage());
            }
        }
    }

