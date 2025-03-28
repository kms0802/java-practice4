package For_while_dowhile.for_while_dowhile_challenges;

import java.util.Scanner;

public class do_while_challenge_1 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        String pw;

        do {
            System.out.println("비밀번호를 입력하세요.");
            pw = scanner.nextLine();
        } while (!pw.equals("hello123"));
        System.out.println("로그인 성공");
        scanner.close();
    }
}
