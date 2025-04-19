package No_Think_Run.Day_10.mission;

import java.util.ArrayList;

public class Day_10_mission_2 {
    public static void main(String[]args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("딸기먹기");
        list.add("바나나먹기");
        list.add("수박먹기");
        list.remove("바나나먹기");

        for (String fruit_eat : list) {
            System.out.println(fruit_eat);
        }
    }
}
