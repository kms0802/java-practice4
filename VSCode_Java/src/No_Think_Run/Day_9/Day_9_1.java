package No_Think_Run.Day_9;

import java.io.FileWriter;
import java.io.IOException;

public class Day_9_1 {
    public static void main(String[]args) {
        try {
            FileWriter writer = new FileWriter("output.txt");
            writer.write("hello java");
            writer.close();
            System.out.println("쓰기 종료");
        } catch (IOException e) {
            System.out.println("예외 처리: " + e.getMessage());
        }
    }
}
