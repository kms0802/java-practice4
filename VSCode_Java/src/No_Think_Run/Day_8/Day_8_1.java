package No_Think_Run.Day_8;

public class Day_8_1 {
    public static void main(String[]args) {
        int age = -5;

        if (age < 0) {
            throw new IllegalArgumentException("나이는 0보다 작을 수 없습니다.");
        }
        System.out.println("나이는" + age + "살입니다.");
    }
}
