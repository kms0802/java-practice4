package No_Think_Run.Day_8.missions;

import java.util.Scanner;

class SignupException extends Exception {
    public SignupException(String message) {
        super(message);
    }
}

public class Day_8_mission_3 {
    public static void validateSignup(String name, int age, String email) throws SignupException{
        if (name.trim()) {
            throw new SignupException("이름을 입력해야 합니다.");
        } else if (age <= 0) {
            throw new SignupException("나이는 1세 이상이어야 합니다.");
        } else if (!email.matches("@")) {
            throw new SignupException("올바른 이메일 형식이 아닙니다.");
        } else {
            System.out.println("회원 가입 완료");
        }
    }

    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
        System.out.print("이름 입력: ");
        String name = scanner.nextLine();
        System.out.println("나이 입력: ");
        int age = scanner.nextInt();
        System.out.println("이메일 입력: ");
        String email = scanner.nextLine();
        validateSignup(name, age, email);   
    } catch (SignupException e) {
        System.out.println("예외처리: " + e.getMessage());
    }
    }
}
