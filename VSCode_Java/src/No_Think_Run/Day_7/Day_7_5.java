package No_Think_Run.Day_7;

public class Day_7_5 {
    public static void main(String[]args) {
        String input = "abc";

        try {
            int number = Integer.parseInt(input);
            System.out.println("변환된 숫자: " + number);
        } catch (NumberFormatException e) {
            System.out.println("예외 발생: 숫자 형식이 아닙니다.");
        }
    }
}
