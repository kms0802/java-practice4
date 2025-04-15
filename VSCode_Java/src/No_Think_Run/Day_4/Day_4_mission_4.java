package No_Think_Run.Day_4;

enum OrderStatus {
    ORDERED, SHIPPED, DELIVERED, CANCELLED;

    public void printStatusMessage() {
        switch (this) {
            case ORDERED:
                System.out.println("주문이 완료되었습니다.");
                break;
            case SHIPPED:
                System.out.println("상품이 배송 중입니다.");
                break;
            case DELIVERED:
                System.out.println("배송이 완료되었습니다.");
                break;
            case CANCELLED:
                System.out.println("주문이 취소되었습니다.");
                break;
        }
    }
}

public class Day_4_mission_4 {
    public static void main(String[ ]args) {
        OrderStatus status = OrderStatus.SHIPPED;
        status.printStatusMessage();
    }
}
