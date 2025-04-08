package OPPs;

public class Student_1 {
    String name;
    int grade;

    public Student_1() {
        this.name = "이름 없음";
        this.grade = 1;
    }

    public Student_1(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    void introduce() {
        System.out.println("안녕하세요, " + grade + "학년 " + name + "입니다. ");
    }
}
