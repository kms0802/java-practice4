package OPPs.OPP_Challenges;

class Person {
    String name;
    int age;

    void introduce() {
        System.out.println("안녕하세요 저는" + name + "이고, " + age + "살 입니다. ");
    }
}

public class OPP_Challenge_1 {
    public static void main(String[]args) {
        Person person1 = new Person();
        person1.name = "홍길동";
        person1.age = 25;

        person1.introduce();
    }

}
