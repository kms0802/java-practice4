package OPPs.OPP_Challenges;

class Book {
    String title;
    String author;

    void printInfo() {
        System.out.println("책 제목 : " + title);
        System.out.println("저자: " + author);
    }
}

class Library {
    String libraryName;
    Book book1;
    Book book2;

    void printLibraryInfo() {
        System.out.println("도서관 : " + libraryName);
        book1.printInfo();
        book2.printInfo();
    }
}

public class OPP_Challenge_2 {
    public static void main(String[]args) {
        
        Book book1 = new Book();
        book1.title = "자바 기초";
        book1.author = "홍길동";

        Book book2 = new Book();
        book2.title = "객체지향 입문";
        book2.author = "김영희";

        Library library = new Library();
        library.libraryName = "중앙도서관";
        library.book1 = book1;
        library.book2 = book2;

        library.printLibraryInfo();
    }
}
