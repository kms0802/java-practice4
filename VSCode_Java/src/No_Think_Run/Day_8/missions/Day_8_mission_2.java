package No_Think_Run.Day_8.missions;

import java.util.Scanner;

class PasswordException extends Exception {
    public PasswordException(String message) {
        super(message);
    }
}

public class Day_8_mission_2 {
        public static void checkPassword(String password) throws PasswordException{
            if (password.length() < 8) {
                throw new PasswordException("비밀번호는 8자 이상이어야 합니다.");
            } else if (!password.matches(".*\\d.*")) {
                throw new PasswordException("비밀번호는 적어도 하나의 숫자가 포함되어야 합니다.");
            } else {
                System.out.println("비밀번호 설정 완료");
            }
        }

        public static void main(String[]args) {
            Scanner scanner = new Scanner(System.in);
    
            try {
                String pw = scanner.nextLine();
                checkPassword(pw);
            } catch (PasswordException e) {
                System.out.println("예외처리: " + e.getMessage());
            } finally {
                scanner.close();
                System.out.println("프로그램 종료");
            }
        }
}
