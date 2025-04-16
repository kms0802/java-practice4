package No_Think_Run.Day_6;

import java.util.stream.Collectors;
import java.util.List;
import java.util.ArrayList;

public class Day_6_5 {
    public static void main(String[]args) {
        List<String> names = List.of("Tom", "Alice", "Bob", "Charlie");

        List<String> filtered = names.stream()
                                     .filter(name -> name.length() >= 4)
                                     .collect(Collectors.toList());
    }
}
