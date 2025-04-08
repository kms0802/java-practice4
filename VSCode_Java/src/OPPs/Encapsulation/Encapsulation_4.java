package OPPs.Encapsulation;

public class Encapsulation_4 {
    public static void main(String[]args) {
        Book_1 book = new Book_1("자바의 정석", "남궁성", 35000);

        book.printInfo();

        book.setPrice(-1000);
        book.setTitle("Effective Java");

        book.printInfo();
    }
}
