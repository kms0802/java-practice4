package No_Think_Run.Day_5;

@FunctionalInterface
interface Calculator {
    int operate(int a, int b);
}

public class Day_5_2 {
    public static void main(String[]args) {
        Calculator add = (a, b) -> a + b;

        int result = add.operate(5, 3);
        System.out.println("5 + 3 = " + result);
    }
}
