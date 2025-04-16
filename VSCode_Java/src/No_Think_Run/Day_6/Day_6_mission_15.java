package No_Think_Run.Day_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Day_6_mission_15 {
    public static void main(String[]args) {
        List<String> names = List.of("Alice", "Bob", "Charlie");

        String result = names.stream()
        .collect(Collectors.joining(","));
    
    System.out.println(result);
    }
}
