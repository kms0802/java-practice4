package Try_Catch;

public class Try_Catch_2 {
    public static void main(String[]args) {
        try {
            int[] numbers = {1, 2, 3};

            int result = 10 / 0; // ArithmeticException
            System.out.println("결과: " + result);

            System.out.println(numbers[5]); // ArrayIndexOutOfBoundsException

            int num = Integer.parseInt("abc"); // NumberFormatException
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다! -> " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열 인덱스를 벗어났습니다! -> " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("숫자 형식이 잘못되었습니다! -> " + e.getMessage());
        } catch (Exception e) {
            System.out.println("기타 예외 발생! -> " + e.getMessage());
        }

        System.out.println("프로그램이 정상적으로 종료되었습니다.");
    }
}
