package No_Think_Run.Day_10.mission;

import java.util.*;
import java.io.*;

public class Day_10_mission_6 {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 5; i ++) {
            System.out.println("입력" + (i + 1));
            list.add(scanner.nextLine());
        }
        System.out.println(list);
        try {
            FileWriter writer = new FileWriter("todo.txt");
            for (String task : list) {
                writer.write(task + "\n");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
