package OPPs.Class;

class Book {
    String title;
    String author;
    int price;

    void printInfo() {
        System.out.println("제목: " + title);
        System.out.println("저자: " + author);
        System.out.println("가격: " + price + "원");
    }

    int getDiscountedPrice(int percent) {
        return price - (price * percent / 100);
    }
}

public class OPP_5 {
    public static void main(String[]args) {
        Book book1 = new Book();
        book1.title = "자바 마스터";
        book1.author = "이강민";
        book1.price = 20000;

        book1.printInfo();
        System.out.println("할인가 (10%) : " + book1.getDiscountedPrice(10) + "원");

        System.out.println();

        Book book2 = new Book();
        book2.title = "객체지향 쉽게 배우기";
        book2.author = "박혜진";
        book2.price = 25000;

        book2.printInfo();
        System.out.println("할인가(20%): " + book2.getDiscountedPrice(20) + "원");
    }
}
