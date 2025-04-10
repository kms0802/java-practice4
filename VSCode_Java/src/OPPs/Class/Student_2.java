package OPPs.Class;

public class Student_2 {
    String name;
    int grade;

    public Student_2(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    void introduce() {
        System.out.println("안녕하세요! 저는" + grade + "학년" + name + "입니다. ");
    }
}
