package No_Think_Run.Day_10.mission;

import java.util.*;

public class Day_10_mission_5 {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= 7; i++) {
            System.out.print("입력" + i);
            list.add(scanner.nextLine());
        }
        System.out.println(list);

        Map<String, Integer> countMap = new HashMap<>();

        for (String task : list) {
            countMap.put(task, countMap.getOrDefault(task, 0) + 1);
        }

        for (String task : countMap.keySet()) {
            System.out.println(task + countMap.get(task));
        }

        scanner.close();
    }
}
