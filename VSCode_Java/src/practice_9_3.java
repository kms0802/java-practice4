import java.util.Scanner;

public class practice_9_3 {
    public static void main(String[]args) {
        int basePrice = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. 아메리카노, 2. 카페라떼, 3. 카푸치노");
        int order = scanner.nextInt();

        switch (order) {
            case 1 :
                System.out.println("주문 음식 : 아메리카노");
                basePrice += 3000;
                break;
            case 2 : 
                System.out.println("주문 음식 : 카페라뗴");
                basePrice += 4000;
                break;
            case 3 : 
                System.out.println("주문 음식 : 카푸치노");
                basePrice += 4500;
                break;
            default :
                System.out.println("정상적인 출력이 아닙니다.");
                return;
        }
        scanner.nextLine();
        System.out.println("1. Small = 기본가격, 2. Medium = 기본가격 + 500, 3. Large = 기본가겨 + 1000");
        int order2 = scanner.nextInt();

        switch (order2) {
            case 1:
                System.out.println("기본 가격");
                break;
            case 2:
                System.out.println("500원 추가");
                basePrice += 500;
                break;
            case 3:
                System.out.println("1000원 추가");
                basePrice += 1000;
            default :
                System.out.println("정상적인 출력이 아닙니다.");
                return;
        }
        scanner.nextLine();
        System.out.println("음료 추가 옵션");
        System.out.println("1. 기본, 2. 샷추가 + 500원, 3. 시럽 추가 + 300원, 4. 샷 시럽 추가 + 800원");
        int order3 = scanner.nextInt();

        switch (order3) {
            case 1:
                System.out.println("기본");
                break;
            case 2:
                System.out.println("샷추가");
                basePrice += 500;
                break;
            case 3:
                System.out.println("시럽 추가");
                basePrice += 300;
                break;
            case 4:
                System.out.println("샷 시럽 추가");
                basePrice += 800;
                break;
            default :
                System.out.println("정상적인 출력값을 입력하세요.");
                return;
        }
        scanner.close();
        System.out.println("최종 가격 : " + basePrice);
    }
}
