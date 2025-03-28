package Scanner_Java.Scanner_Java_Challenge;

import java.util.Scanner;

public class Scanner_Java_Challenge_1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("이름을 입력하세요 : ");
        String name = scanner.nextLine();

        System.out.println("나이를 입력하세요 : ");
        int age = scanner.nextInt();

        scanner.nextLine();
        System.out.println("좋아하는 음식을 입력하세요 : ");
        String food = scanner.nextLine();
        
        

        System.out.println("안녕하세요 제 이름은 " + name + "이고, 나이는 " + age + "살입니다. 제가 좋아하는 음식은 " + food + "입니다.");
        scanner.close();
    }
}