package No_Think_Run.Day_6;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.stream.Collectors;

public class Day_6_mission_12 {
    public static void main(String[]args) {
        List<String> names = List.of("Tom", "Alice", "Bob", "Charlie", "Eve", "Alice", "Eve", "Daniel");

        Set<String> result = names.stream()
             .filter(name -> name.length() >= 4)
             .map(name -> name.toUpperCase())
             .collect(Collectors.toSet());
        
        System.out.println(result);
    }
}
