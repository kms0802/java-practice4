package No_Think_Run;

import java.util.HashSet;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;

public class Day_2 {
    public static void main(String[]args) {
        Set<String> set = new HashSet<>();

        set.add("apple");
        set.add("banana");
        set.add("apple");

        System.out.println("Set 내용: " + set);

        Map<String, String> cap = new HashMap<>();
        cap.put("Korea", "seoul");
        cap.put("Japen", "Tokyo");
        cap.put("USA", "Washington");

        System.out.println("Korea의 수도: " + cap.get("Korea"));

        for (String country : cap.keySet()) {
            System.out.println(country + " -> " + cap.get(country));
        }
    }
}
