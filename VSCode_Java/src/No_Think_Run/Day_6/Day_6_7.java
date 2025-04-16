package No_Think_Run.Day_6;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.stream.Collectors;

public class Day_6_7 {
    public static void main(String[]args) {
        List<String> words = List.of("Hello", "World");
        String result = words.stream()
             .collect(Collectors.joining(", ", "[", "]"));
        System.out.println(result);
    }
}
