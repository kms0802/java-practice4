package OPPs.Encapsulation;

public class Book_1 {
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
            System.out.println("가격은 0 이상이어야 합니다. ");
        }
    }

    public Book_1(String title, String author, int price) {
        this.title = title;
        this.author = author;
        setPrice(price);
    }

    public void printInfo() {
        System.out.println("제목: " + title);
        System.out.println("저자: " + author);
        System.out.println("가격: " + price + "윈");
    }
}
