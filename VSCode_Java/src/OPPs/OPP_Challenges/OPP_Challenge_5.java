package OPPs.OPP_Challenges;

class Product {
    String name;
    int price;

    void printInfo() {
        System.out.print("상품명: " + name + "\n");
        System.out.print("가격" + price + "\n");
    }
}

class Order {
    String customerName;
    Product product1;
    Product product2;

    void printOrder() {
        System.out.print("[" + customerName + "]" + "님의 주문정보\n");
        product1.printInfo();
        product2.printInfo();
    }
}

public class OPP_Challenge_5 {
    public static void main(String[]args) {
        
        Product product1 = new Product();
        product1.name = "새우깡";
        product1.price = 10000000;

        Product product2 = new Product();
        product2.name = "알껌바";
        product2.price = 2500000;

        Order order = new Order();
        order.customerName = "홍길동";
        order.product1 = product1;
        order.product2 = product2;

        order.printOrder();
    }
}
