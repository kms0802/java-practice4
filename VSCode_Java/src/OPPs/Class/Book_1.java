package OPPs.Class;

public class Book_1 {
    String title;
    int price;

    public Book_1(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public void printInfo() {
        System.out.println("제목: " + this.title + ", 가격: " + this.price + "원");
    }

    public void comparePrice(Book_1 other) {
        if (this.price > other.price) {
            System.out.println(this.title + "이가 더 비쌉니다. ");
        } else if (this.price < other.price) {
            System.out.println(other.title + "이가 더 비쌉니다.");
        } else {
            System.out.println("두 책의 가격이 같습니다.");
        }
    }
}
