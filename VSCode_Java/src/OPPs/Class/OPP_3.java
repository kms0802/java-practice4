package OPPs.Class;

class Student {
    String name;
    int age;
    int score;

    void introduce() {
        System.out.println("안녕하세요! 저는 " + age + "살 " + name + "입니다.");
    }

    void checkPass() {
        if (score >= 60) {
            System.out.println(name + " 학생은 합격입니다!");
        } else {
            System.out.println(name + " 학생은 불합격입니다...");
        }
    }
}

public class OPP_3 {
    public static void main(String[]args) {
        Student student1 = new Student();
        student1.name = "홍길동";
        student1.age = 18;
        student1.score = 75;

        student1.introduce();
        student1.checkPass();

        Student student2 = new Student();
        student2.name = "김영희";
        student2.age = 17;
        student2.score = 55;

        student2.introduce();
        student2.checkPass();
    }
}
