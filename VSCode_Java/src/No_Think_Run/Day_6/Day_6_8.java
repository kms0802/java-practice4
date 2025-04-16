package No_Think_Run.Day_6;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.Map;

public class Day_6_8 {
    public static void main(String[]args) {
        List<String> names = List.of("Tom", "Alice", "Bob", "Charlie", "Eve");

        Map<Integer, List<String>> grouped = names.stream()
             .collect(Collectors.groupingBy(name -> name.length()));

        System.out.println(grouped);
    }
}
