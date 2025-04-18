package No_Think_Run.Day_7;

public class Day_7__6 {
    public static void main(String[]args) {
        String text = "Java";

        try {
            char ch = text.charAt(0);
            System.out.println("문자: " + ch);

        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("예외 발생: 문자열 인덱스 범위를 벗어났습니다.");
        }

        System.out.println("프로그램 종료");
    }
}
