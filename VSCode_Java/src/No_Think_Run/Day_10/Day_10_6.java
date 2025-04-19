package No_Think_Run.Day_10;

import java.util.*;

public class Day_10_6 {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        for (int i = 1; i <= 7; i++) {
            System.out.println(i + "할일 입력");
            list.add(scanner.nextLine());
        }

        Map<String, Integer> listed = new HashMap<>();
        for (String task : list) {
            listed.put(task, listed.getOrDefault(task, 0) + 1);
        }

        System.out.println("\n--- 항목별 등장 횟수 ---");
        for (String task : listed.keySet()) {
            System.out.println(task = " : " + listed.get(task) + "회");
        }
    }
}
