package OPPs.OPP_Challenges;

public class User_1 {
    String name;
    int age;

    public User_1 setName(String name) {
        this.name = name;
        return this;
    }

    public User_1 setAge(int age) {
        this.age = age;
        return this;
    }

    void printInfo() {
        System.out.println("이름: " + this.name + ", 나이: " + this.age);
    }
}
