package OPPs.Dependence.Dependence_1;

class Document {
    String content;

    public Document(String content) {
        this.content = content;
    }

    public void printContent() {
        System.out.println("문서 내용: " + content);
    }
}

class Printer {
    public void print(Document doc) {
        System.out.println("프린터가 문서를 출력합니다.");
        doc.printContent();
    }
}

public class Main {
    public static void main(String[]args) {
        Document d = new Document("자바 객체지향 공부 중...");
        Printer p = new Printer();

        p.print(d);
    }
}
