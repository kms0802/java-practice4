package No_Think_Run.Day_5;

@FunctionalInterface
interface Calculator {
    int operate(int a, int b);
}

public class Day_5_mission_6 {
    public static void main(String[]args) {
        Calculator add = (a, b) -> a + b;
        Calculator sub = (a, b) -> a - b;
        Calculator gob = (a, b) -> a * b;
        Calculator div = (a, b) -> b == 0 ? 0 : a / b;

        System.out.println(add.operate(10, 2));
        System.out.println(sub.operate(10, 2));
        System.out.println(gob.operate(10, 2));
        System.out.println(div.operate(10, 2));
    }
}
