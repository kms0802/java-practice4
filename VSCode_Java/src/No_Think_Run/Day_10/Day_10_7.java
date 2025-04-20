package No_Think_Run.Day_10;

import java.util.*;
import java.io.*;

public class Day_10_7 {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        
        for (int i = 0; i < 5; i ++) {
            System.out.println("할일: ");
            list.add(scanner.nextLine());
        }

        try {
            FileWriter writer = new FileWriter("todo.txt");
            
            for (String task : list) {
                writer.write(task + "\n");
            }
            writer.close();
            System.out.println("저장");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
            System.out.println("종료");
        }

        
    }
}
