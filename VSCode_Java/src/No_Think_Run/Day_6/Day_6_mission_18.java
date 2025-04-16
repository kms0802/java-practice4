package No_Think_Run.Day_6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Set;
import java.util.Map;

public class Day_6_mission_18 {
    public static void main(String[]args) {
        List<String> names = List.of("Tom", "Alice", "Bob", "Charlie", "Eve", "Daniel", "Tony", "Amanda");
    
        Map<Character, List<String>> groupped = names.stream()
             .collect(Collectors.groupingBy(name -> name.charAt(0)));

        System.out.println(groupped);
    }
}
