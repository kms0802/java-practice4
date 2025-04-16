package No_Think_Run.Day_6;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Set;

public class Day_6_6 {
    public static void main(String[]args) {
        List<String> names = List.of("Alice", "Bob", "Alice", "Eve", "Bob");

        Set<String> result = names.stream()
             .filter(name -> name.length() >= 4)
             .collect(Collectors.toSet());

        System.out.println(result);
    }
}
