package No_Think_Run.Day_9.missions;

import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class Day_9_mission_1_2 {
    public static void main(String[]args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("memo.txt"));
            String line;
            while((line = reader.readLine()) != null) {
                System.out.println("일기 내용: " + line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("예외 처리: " + e.getMessage());
        }
    }
}
