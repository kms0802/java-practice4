package No_Think_Run.Day_9;

import java.io.FileWriter;
import java.io.IOException;

public class Day_9_3 {
    public static void main(String[]args) {
        try {
            FileWriter writer = new FileWriter("memo.txt", true);
            writer.write("이 줄은 기존 내용 뒤에 추가됩니다.\n");
            writer.close();
            System.out.println("파일에 내용 추가 완료!");
        } catch (IOException e) {
            System.out.println("예외 발생: " + e.getMessage());
        }
    }
}
