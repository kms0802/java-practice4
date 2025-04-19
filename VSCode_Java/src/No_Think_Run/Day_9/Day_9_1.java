package No_Think_Run.Day_9;

import java.io.IOException;
import java.io.FileWriter;

public class Day_9_1 {
      public static void main(String[]args) {
        try {
            FileWriter writer = new FileWriter("output.txt");
            writer.write("hello");
            writer.close();
            System.out.println("쓰기 완료");
        } catch (IOException e) {
            System.out.println("예외 처리: " + e.getMessage());
        }
      }
}
