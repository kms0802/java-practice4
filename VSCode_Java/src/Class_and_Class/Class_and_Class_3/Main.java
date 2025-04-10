package Class_and_Class.Class_and_Class_3;

class Author {
    String name;
    String nationality;
    
    public Author(String name, String nationality) {
        this.name = name;
        this.nationality = nationality;
    }

    public void printAuthor() {
        System.out.println("저자: " + name + " (" + nationality + ")");
    }
}

class Book {
    String title;
    Author author;

    public Book(String title, Author author) {
        this.title = title;
        this.author = author;
    }

    public void printBookInfo() {
        System.out.println("책 제목: " + title);
        author.printAuthor();
    }
}

public class Main {
    public static void main(String[]args) {
        Author a = new Author("이문열", "대한민국");
        Book b = new Book("삼국지", a);

        b.printBookInfo();
    }
}
