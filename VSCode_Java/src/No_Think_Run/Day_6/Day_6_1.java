package No_Think_Run.Day_6;

import java.util.List;
import java.util.ArrayList;

public class Day_6_1 {
    public static void main(String[]args) {
        List<String> names = List.of("a", "bee", "cat", "doggy");
        names.stream()
             .filter(n -> n.length() > 2)
             .map(String::toUpperCase)
             .forEach(System.out::println);
    }
}
