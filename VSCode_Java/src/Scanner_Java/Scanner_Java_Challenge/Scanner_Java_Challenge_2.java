package Scanner_Java.Scanner_Java_Challenge;

import java.util.Scanner;

public class Scanner_Java_Challenge_2 {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("별명을 입력하세요 .");
        String nickname = scanner.nextLine();

        System.out.println("나이를 입력하세요 . ");
        int age = scanner.nextInt();

        scanner.nextLine();

        System.out.println("좋아하는 취미를 입력하세요 .");

        String hobby = scanner.nextLine();

        System.out.println("----------------------------------");
        System.out.println(nickname + "님, 반가워요!");
        System.out.println(age + "살 이시고, 좋아하는 취미는 " + hobby + "이시군요!");

        scanner.close();
    }
}