package No_Think_Run.Day_9;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class Day_9_2 {
    public static void main(String[]args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
            String line;
            while((line = reader.readLine()) != null) {
                System.out.println("읽은 내용: " + line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("예외 처리: " + e.getMessage());
        }
    }
}
