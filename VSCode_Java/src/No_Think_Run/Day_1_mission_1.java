package No_Think_Run;

import java.util.ArrayList;
import java.util.List;

public class Day_1_mission_1 {
    public static void main(String[]args) {
        List<String> animals = new ArrayList<>();

        animals.add("dog");
        animals.add("cat");
        animals.add("bird");

        animals.set(1, "hamster");

        for (String animal : animals) {
            System.out.println(animal);
        }
    }
}
