package OPPs.Inheritance;

class Person {
    protected String name;
    protected int age;

    public void introduce() {
        System.out.println("이름: " + name + ", 나이: " + age);
    }
}

class Student extends Person {
    private String school;

    public void setInfo(String name, int age, String school) {
        this.name = name;
        this.age = age;
        this.school = school;
    }

    public void printStudentInfo() {
        introduce();
        System.out.println("학교: " + school);
    }
}

public class Inheritance_2 {
    public static void main(String[]args) {
        Student s = new Student();
        s.setInfo("김지민", 17, "서울고등학교");
        s.printStudentInfo();
    }
}
