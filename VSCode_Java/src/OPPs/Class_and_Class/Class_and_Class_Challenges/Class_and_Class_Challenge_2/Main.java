package OPPs.Class_and_Class.Class_and_Class_Challenges.Class_and_Class_Challenge_2;

class Book {
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void printInfo() {
        System.out.println("책 제목: " + title + ", 저자: "  + author);
    }
}

class Library {
    String name;
    Book book;

    public Library(String name, Book book) {
        this.name = name;
        this.book = book;
    }

    public void showLibraryInfo() {
        System.out.println("도서관 이름: " + name);
        book.printInfo();
    }
}

public class Main {
    public static void main(String[]args) {
        Book book = new Book("자바의 정석", "남궁석");
        Library library = new Library("중앙도서관", book);

        library.showLibraryInfo();
    }
}
