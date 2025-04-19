package No_Think_Run.Day_10;

import java.util.ArrayList;

public class Day_10_1 {
    public static void main(String[]args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("사과");
        list.add("바나나");
        list.add("체리");

        for (String fruit : list) {
            System.out.println(fruit);
        }
    }
}
