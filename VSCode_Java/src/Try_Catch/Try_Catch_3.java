package Try_Catch;

import java.util.Scanner;

public class Try_Catch_3 {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);

        String[] colors = {"빨강", "초록", "파랑"};

        try {
            System.out.println("숫자를 입력하세요 (0~2): ");
            String input = scanner.nextLine();

            int index = Integer.parseInt(input);

            System.out.println("선택한 색상: " + colors[index]);
        } catch (NumberFormatException e) {
            System.out.println("숫자가 아닌 값을 입력했습니다.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("유효하지 않은 번호입니다. 0~2 사이로 입력하세요.");
        } catch (Exception e) {
            System.out.println("예상치 못한 오류가 발생했습니다: " + e.getMessage());
        }

        scanner.close();
    }
}
