package OPPs;

public class Person_3 {
    String name;
    int age;

    public Person_3(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce() {
        System.out.println("안녕하세요, 저는 " + age + "살 " + name + "입니다. ");
    }
}
