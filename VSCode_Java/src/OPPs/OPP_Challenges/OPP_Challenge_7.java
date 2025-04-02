package OPPs.OPP_Challenges;

class MenuItem {
    String name; //메뉴 이름
    int price; //가격

    void printInfo() {
        System.out.println("메뉴: " + name + ", 가격: " + price);
    }
}

class Order_1 {
    String customerName;
    MenuItem item;

    void printOrder() {
        System.out.println(customerName + "님의 주문 내역");
        item.printInfo();
    }
}

public class OPP_Challenge_7 {
    public static void main(String[]args) {
        
        MenuItem item = new MenuItem();
        item.name = "프링글스";
        item.price = 15000;

        Order_1 order = new Order_1();
        order.customerName = "길동이";
        order.item = item;

        order.printOrder();
    }
}
