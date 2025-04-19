package No_Think_Run.Day_10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Day_10_3 {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> todoList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("할 일 " + (i + 1) + ": ");
            todoList.add(scanner.nextLine());
        }

        System.out.println("\n--- 입력한 할 일 목록 ---");
        for (String task : todoList) {
            System.out.println(task);
        }

        Collections.sort(todoList);

        System.out.println("\n--- 정렬된 할 일 목록 (가나다순) ---");
        for (String task : todoList) {
            System.out.print(task + "\n");
        }

        scanner.close();
    }
}
