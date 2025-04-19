package No_Think_Run.Day_10;

import java.util.ArrayList;
import java.util.Scanner;

public class Day_10_2 {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> todoList = new ArrayList<>();

        for (int i = 0; i < 3; i ++) {
            System.out.println("할 일 " + (i + 1) + ": ");
            String task = scanner.nextLine();
            todoList.add(task);
        }

        System.out.println("\n--- 현재 할 일 목록 ---");
        for (int i = 0; i < todoList.size(); i++) {
            System.out.println((i + 1) + ", " + todoList.get(i));
        }

        System.out.print("\n삭제할 항목 번호 입력: ");
        int deleteIndex = scanner.nextInt() - 1;

        if (deleteIndex >= 0 && deleteIndex < todoList.size()) {
            todoList.remove(deleteIndex);
            System.out.println("항목이 삭제되었습니다.");
        } else {
            System.out.println("잘못된 번호입니다.");
        }

        System.out.println("\n--- 최종 할 일 목록 ---");
        for (int i = 0; i < todoList.size(); i ++) {
            System.out.println((i + 1) + ", " + todoList.get(i));
        }
    }
}
