import java.util.Scanner;

public class javaP11_2 {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in); 
        // 사용자 입력받기
        
        int num , sum = 0;
        int count = 0;      // 입력받을 정수값과 합계값 카운트값 설정(가비지값 초기화)
        
        while (true) {
            System.out.print("점수를 입력하세요 (종료하려면 음수를 입력): "); // 입력 안내 메시지

            num = scanner.nextInt(); // 반복적으로 입력받기
            
            scanner.nextLine(); // 줄

            if (num < 0) { // 입력값이 음수일 경우,
                break; // break로 루프를 종료한다. (추가로 음수로 입력받았을 경우 sum값으로 더해지기전에 여기서 끊어준다.)
            }

            sum = sum + num; // 합계에 입력받은 값을 계속 추가한다.
            count ++; // 카운트값 증가 (여기서 1이상부터는 의미가 없다.)
        }

        if (count != 0) { // 카운트가 0이 아니다 == 음수가 아닌 양수를 입력받았다.
            System.out.println("점수의 총합은: [" + sum + "]");
        } else {          // 카운트가 0이다 == 양수가 아닌 음수를 입력받았다.
            System.out.println("입력된 점수가 없습니다.");
        }

        scanner.close(); // 스캐너 닫기
    }
}
