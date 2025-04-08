package OPPs.Encapsulation.Encapsulation_Challenges;

class Book_1 {
    private String title;
    private String author;
    private int price;

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(int price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("0부터 입력할 수 있습니다. ");
        }
    }

    public Book_1(String title, String author, int price) {
        setTitle(title);
        setAuthor(author);
        setPrice(price);
    }

    void printInfo() {
        System.out.print("도서 정보\n");
        System.out.print("제목: " + title + "\n");
        System.out.print("저자: " + author + "\n");
        System.out.print("가격: " + price + "원\n");
    }
}

public class Encapsulation_Challenge_3 {
    public static void main(String[]args) {
        Book_1 book1 = new Book_1("비었음","비었음",0);

        book1.setTitle("러시아 문학과 사상");
        book1.setAuthor("이영범");
        book1.setPrice(20000);

        book1.printInfo();
    }
}
