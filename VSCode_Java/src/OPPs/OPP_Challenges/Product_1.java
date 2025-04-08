package OPPs.OPP_Challenges;

public class Product_1 {
    String name;
    int price;

    public Product_1(String name, int price) {
        this.name = name;
        this.price = price;
    }

    void printInfo() {
        System.out.println("상품명: " + this.name + ", 가격: " + this.price);
    }
}
