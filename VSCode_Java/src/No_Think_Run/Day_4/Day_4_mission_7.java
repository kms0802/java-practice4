package No_Think_Run.Day_4;

enum Fruit {
    APPLE,
    BANANA,
    GRAPE;
}

public class Day_4_mission_7 {
    public static void main(String[]args) {
        Fruit selected = Fruit.BANANA;

        switch (selected) {
            case APPLE:
                System.out.println("사과의 가격은 1000원 입니다.");
                break;
            case BANANA:
                System.out.println("바나나의 가격은 1500원 입니다.");
                break;
            case GRAPE:
                System.out.println("포도의 가격은 2000원 입니다.");
        }
    }
}
