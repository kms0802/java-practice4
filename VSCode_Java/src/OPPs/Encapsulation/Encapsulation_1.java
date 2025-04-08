package OPPs.Encapsulation;

public class Encapsulation_1 {
    public static void main(String[]args) {
        Student s = new Student();

        s.setName("홍길동");
        s.setAge(20);

        System.out.println("이름: " + s.getName());
        System.out.println("나이: " + s.getAge());
    }
}
