package No_Think_Run.Day_6;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.stream.Collectors;

public class Day_6_mission_16 {
    public static void main(String[]args) {
        List<String> names = List.of("alice", "bob", "charlie");

        String result = names.stream()
             .map(name -> name.toUpperCase())
             .collect(Collectors.joining("|", "(",  ")"));
            System.out.println(result);
            }
}
