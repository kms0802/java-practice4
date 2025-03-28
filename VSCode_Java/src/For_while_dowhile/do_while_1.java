package For_while_dowhile;

import java.util.Scanner;

public class do_while_1 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        int menu;

        do {
            System.out.println("1. 게임 시작");
            System.out.println("2. 설정");
            System.out.println("3. 종료");
            System.out.println("메뉴를 선택하세요 : ");
            menu = scanner.nextInt();
        } while (menu != 3);
        System.out.println("프록램을 종료합니다.");
        scanner.close();
    }
    
}
