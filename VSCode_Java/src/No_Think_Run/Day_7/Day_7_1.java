package No_Think_Run.Day_7;

public class Day_7_1 {
    public static void main(String[]args) {
        int num1 = 10;
        int num2 = 0;

        try {
            int result = num1 / num2;
            System.out.println("결과: " + result);
        } catch (ArithmeticException e) {
            System.out.println("예외 발생: 0으로 나눌 수 없습니다.");
        } finally {
            
        }

        System.out.println("프로그램이 정상적으로 종료되었습니다. ");
        
    }
}
