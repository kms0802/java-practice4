package No_Think_Run.Day_6;

import java.util.*;
import java.util.stream.*;

public class Day_6_mission_27 {
    public static void main(String[]args) {
        List<String> logs = List.of("Alice", "Bob", "Alice", "Charlie", "Bob", "Alice", "Daniel", "Eve", "Charlie", "Eve", "Eve", "Frank");

        Map<String, Long> userCounts = logs.stream()
             .collect(Collectors.groupingBy(
                user -> user, Collectors.counting()
             ));
        
        Map<Long, Set<String>> result = userCounts.entrySet().stream()
             .collect(Collectors.groupingBy(
                entry -> entry.getValue(),
                Collectors.mapping(entry -> entry.getKey(),
                Collectors.toSet())
             ));

        System.out.println(result);
    }
}
