package For_while_dowhile;

import java.util.Scanner;

public class do_while_3 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        String input;

        do {
            System.out.println("비밀번호를 입력하세요. ");
            input = scanner.nextLine();
        } while (!input.equals("1234"));
        System.out.println("접속 성공! ");
        scanner.close();
    }
}
