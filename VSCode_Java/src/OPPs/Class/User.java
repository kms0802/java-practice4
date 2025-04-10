package OPPs;

public class User {
    String name;
    int age;

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public User setAge(int age) {
        this.age = age;
        return this;
    }

    public void printInfo() {
        System.out.println("이름: " + name + ", 나이: " + age);
    }
}
