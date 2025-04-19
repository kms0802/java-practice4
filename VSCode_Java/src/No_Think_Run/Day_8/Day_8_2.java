package No_Think_Run.Day_8;

import java.util.Scanner;

class PriceException extends Exception{
    public PriceException(String message) {
        super(message);
    }
}

public class Day_8_2 {
    public static void checkPrice(int price) throws PriceException{
        if (price < 0) {
            throw new PriceException("가격은 음수가 될 수 없습니다.");
    } else if (price > 1000) {
        throw new PriceException("가격이 너무 비쌉니다.");
    } else {
        System.out.println("입력한 가격: " + price + "원");
    }
}

public static void main(String[]args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("가격을 입력하세요: ");
    int price = scanner.nextInt();

    try {
        checkPrice(price);
    } catch (PriceException e) {
        System.out.println("예외 발생: " + e.getMessage());
    }
}
}