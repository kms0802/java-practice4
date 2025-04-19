package No_Think_Run.Day_10;

import java.util.*;

public class Day_10_5 {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> todoList = new ArrayList<>();

        for (int i = 0; i < 7; i++) {
            System.out.println("할 일 " + (i + 1) + ": ");
            todoList.add(scanner.nextLine());
        }

        Set<String> uniqueTasks = new LinkedHashSet<>(todoList);
        for (String task : uniqueTasks) {
            System.out.println(task);
        }

        scanner.close();
    }
}
