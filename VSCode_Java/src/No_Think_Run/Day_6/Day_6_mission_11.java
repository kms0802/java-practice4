package No_Think_Run.Day_6;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Day_6_mission_11 {
    public static void main(String[]args) {
        List<String> names = List.of("Tom", "Alice", "Bob", "Charlie", "Eve", "Daniel");

        List<String> result = names.stream()
             .filter(name -> name.length() <= 3)
             .map(name -> name.toLowerCase())
             .collect(Collectors.toList());
            
        System.out.println(result);
    }
}
