package No_Think_Run.Day_7;

public class Day_7_4 {
    public static void main(String[]args) {
        int[] numbers = {10, 20, 30};

        try {
            System.out.println("4번째 숫자: " + numbers[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("예외 발생: 배열 인덱스 범위를 벗어났습니다.");
        }

        System.out.println("프로그램 종료");
    }
}
