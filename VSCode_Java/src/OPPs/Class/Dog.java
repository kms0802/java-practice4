package OPPs;

public class Dog {
    String name;
    int age;

    public Dog(String n, int a) {
        name = n;
        age = a;
    }
    
    void introduce() {
        System.out.println("저는 " + age + "살 강아지 " + name + "입니다! ");
    }
}
