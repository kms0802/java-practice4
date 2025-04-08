package OPPs.Inheritance;

class Book {
    protected String title;
    protected String author;

    public void setBookInfo(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void printBookInfo() {
        System.out.println("제목: " + title);
        System.out.println("저자: " + author);
    }
}

class EBook extends Book {
    private int fileSize;

    public void setFileSize(int size) {
        fileSize = size;
    }

    public void printEBookInfo() {
        printBookInfo();
        System.out.println("파일 크기: " + fileSize + "MB");
    }
}

public class Inheritance_7 {
    public static void main(String[]args) {
        EBook ebook = new EBook();
        ebook.setBookInfo("이펙티브 자바", "조슈아 블로크");
        ebook.setFileSize(15);
        ebook.printEBookInfo();
    }
}
