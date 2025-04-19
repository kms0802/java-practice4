package No_Think_Run.Day_10.mission;

import java.util.ArrayList;

public class Day_10_mission_1 {
    public static void main(String[]args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("프로젝트 만들기");
        list.add("운동하기");
        list.add("자기");

        for (String project : list) {
            System.out.println(project);
        }
    }
}
