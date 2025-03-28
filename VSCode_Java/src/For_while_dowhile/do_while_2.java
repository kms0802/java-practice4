package For_while_dowhile;

import java.util.Scanner;

public class do_while_2 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        int choice;

        do {
            System.out.println("==== 메뉴 ====");
            System.out.println("1. 시작");
            System.out.println("2. 설정");
            System.out.println("3. 종료");
            System.out.println("선택 : ");
            
            choice = scanner.nextInt();
        } while (choice != 3);

        System.out.println("종료합니다.");
        scanner.close();
    }
}
