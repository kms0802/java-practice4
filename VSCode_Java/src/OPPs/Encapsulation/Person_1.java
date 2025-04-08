package OPPs.Encapsulation;

public class Person_1 {
    private String name;
    private int age;
    private double height;

    public Person_1(String name, int age, double height) {
        this.name = name;
        setAge(age);
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 150) {
            this.age = age;
        } else {
            System.out.println("나이는 0~150 사이여야 합니다.");
        }
    }

    public void setHeight(double height) {
        if (height >= 30 && height <= 300) {
            this.height = height;
        } else {
            System.out.println("키는 30~300cm 사이여야 합니다.");
        }
    }

    public void printInfo() {
        System.out.println("이름: " + name + ", 나이: " + age + ", 키: " + height + "cm");
    }
}
