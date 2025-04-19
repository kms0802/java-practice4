package No_Think_Run.Day_10.mission;

import java.util.*;

public class Day_10_mission_4 {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        
        for (int i = 1; i <= 7; i++) {
            System.out.print(i + "할일 입력");
            list.add(scanner.nextLine());
        }
        
        System.out.println(list);

        Set<String> list_set = new LinkedHashSet<>(list);
        System.out.println(list_set);
        for (String li : list_set) {
            System.out.println(li);
        }
    }
}
