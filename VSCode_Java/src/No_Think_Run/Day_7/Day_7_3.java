package No_Think_Run.Day_7;

public class Day_7_3 {
    public static void main(String[]args) {
        String text = null;

        try {

            System.out.println("문자 수: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("예외 발생: 문자열이 null 입니다.");
        } finally {
            System.out.println("프로그램 종료");
            
        }
    }
}
