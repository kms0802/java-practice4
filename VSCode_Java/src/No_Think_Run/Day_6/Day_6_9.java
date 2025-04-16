package No_Think_Run.Day_6;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.Map;
import java.util.stream.Collectors;

public class Day_6_9 {
    public static void main(String[]args) {
        List<String> names = List.of("Tom", "Alice", "Bob", "Charlie", "Eve", "Daniel");
    
        Map<Integer, List<String>> grouped = names.stream()
             .collect(Collectors.groupingBy(name -> name.length()));

        System.out.println(grouped);
    }
}
