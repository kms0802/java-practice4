package No_Think_Run.Day_6;

import java.util.List;
import java.util.ArrayList;

public class Day_6_3 {
    public static void main(String[]args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        numbers.stream()
               .map(n -> n * 2)
               .forEach(System.out::println);

        List<String> names = List.of("alice", "bob", "eve");

        names.stream()
             .map(String::toUpperCase)
             .forEach(System.out::println);
    }
}
