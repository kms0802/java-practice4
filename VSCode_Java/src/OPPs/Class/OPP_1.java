package OPPs;

class Dog {
    
    String name;
    int age;

    void bark() {
        System.out.println(name + "가 멍멍 짖습니다! ");
    }

    void introduce() {
        System.out.println("저는 " + age + "살 " + name + "입니다.");
    }
}

public class OPP_1 {
    public static void main(String[]args) {
        Dog myDog = new Dog();
        myDog.name = "초코";
        myDog.age = 3;

        myDog.bark();
        myDog.introduce();
    }
}
