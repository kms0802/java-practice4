package OPPs.Inheritance.Inheritance_Challenges;

class Person {
    protected String name;
    protected int age;

    public void setInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void printInfo() {
        System.out.println("이름: " + name);
        System.out.println("나이: " + age + "세");
    }
}

class Student extends Person {
    private String school;

    public void setSchool(String school) {
        this.school = school;
    }

    public void printStudentInfo() {
        printInfo();
        System.out.println("학교: " + school);
    }
}

public class Inheritance_Challenge_1 {
    public static void main(String[]args) {
        Student s = new Student();
        s.setInfo("이수연", 18);
        s.setSchool("서울고등학교");
        s.printStudentInfo();
    }
}
