package No_Think_Run.Day_10.mission;

import java.util.ArrayList;
import java.util.Scanner;

public class Day_10_mission_3 {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        System.out.print("얼마나 많은 일을 할껀지: ");
        int ad1 = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < ad1; i ++) {
            System.out.print((i + 1) + "번째 할일 입력: ");
            String project = scanner.nextLine();
            list.add(project);
            System.out.println("현재 입력한 할일 상태: " + list);
        }
        
        System.out.print("몇개를 삭제할건지 입력: ");
        int rem = scanner.nextInt();
        scanner.nextLine();
        if (rem <= ad1) {
            for (int i = 1; i <= rem; i ++) {
                System.out.println(i + "무엇을 삭제할껀지?" + list);
                String remarr = scanner.nextLine();
                list.remove(remarr);
            }
        } else {
            System.out.println("추가한 내용보다 많으면 안됨");
            
        }
        System.out.println("최종 할일 목록" + list);
    }
}
